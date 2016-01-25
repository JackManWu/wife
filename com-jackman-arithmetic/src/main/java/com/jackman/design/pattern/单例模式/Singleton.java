package com.jackman.design.pattern.单例模式;

/**
 * Created by wujinlei on 2016/1/25.
 * 双重检查加锁
 */
public class Singleton {
    private volatile static Singleton instance = null;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
