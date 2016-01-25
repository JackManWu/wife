package com.jackman.design.pattern.单例模式;

/**
 * Created by wujinlei on 2016/1/25.
 * 延迟加载及线程安全
 */
public class SingletonOther {
    private SingletonOther() {

    }

    private static class SingletonHolder {
        private static SingletonOther instance = new SingletonOther();
    }

    public static SingletonOther getInstance() {
        return SingletonHolder.instance;
    }
}
