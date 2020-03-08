package com.hanrx.rxjavaframework;

/**
 * Observable 集市
 *  T  代表打铁
 */
public class Observable<T> {
    //养羊的人
    private OnSubscrible<T> onSubscrible;

    public Observable(OnSubscrible<T> onSubscrible) {
        this.onSubscrible = onSubscrible;
    }
    /**
     * 实例化买卖羊的集市
     * @param onSubscrible
     * @param <T>
     * @return
     */
    public static <T> Observable<T>  create(OnSubscrible<T> onSubscrible) {
        return new Observable<>(onSubscrible);
    }

    /**
     * 铁匠来到集市
     * @param subscrible
     */
    public void subscrible(Subscrible<? super T> subscrible) {
        //养羊的人
        onSubscrible.call(subscrible);
    }

    /**
     * 实例化 打铁的集市
     * @param func  转换的函数   羊--》铁
     * @param <R>
     * @return
     */
    public <R> Observable<R> map(Func1<? super  T,? extends R> func)
    {
        //OperatorMap  作为介绍人
        return  lift(new OperatorMap<T,R>(func));
    }

    private <R> Observable<R> lift(OperatorMap<T, R> trOperatorMap) {
        //代码运行在这里面的时候 是买羊的集市

        //OnSubsricbleLift  作为卖铁的人
        return new Observable<>(new OnSubScribleLift<>(onSubscrible,trOperatorMap));
    }
}
