package com.hanrx.rxjavaframework;

/**
 * 角色 ：铁匠
 * T 代表具备的能力， 她会用铁做生活工具
 * @param <T>
 */
public abstract class Subscrible<T> {
    //T  t
    public abstract void onNext(T t);

}
