package com.hanrx.rxjavaframework;

/**
 *
 * @param <T> 羊
 * @param <R> 铁
 */
public interface Operator<T, R> extends Func1<Subscrible<? super T>, Subscrible<? super R>>{

}
