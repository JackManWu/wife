package com.jackman.design.pattern.单例模式;

/**
 * Created by JackMan on 2016/1/25.
 * 饿汉式
 */
public class EagerSingleton {
    private static EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
        return instance;
    }
}
