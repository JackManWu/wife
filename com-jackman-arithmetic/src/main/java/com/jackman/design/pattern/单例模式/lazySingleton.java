package com.jackman.design.pattern.单例模式;

/**
 * Created by JackMan on 2016/1/25.
 * 懒汉式
 */
public class LazySingleton {
    private static LazySingleton instance = null;

    private LazySingleton() {
    }

    public static synchronized LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
