package com.hanrx.rxjavaframework;

/**
 * 抽象的换的行为
 * @param <T> 代表放羊的角色
 * @param <R> 代表打铁的角色
 */
public interface Func1<T, R> {
    R call(T t);
}
