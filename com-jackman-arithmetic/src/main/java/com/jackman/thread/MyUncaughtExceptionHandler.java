package com.jackman.thread;

/**
 * Created by JackMan on 2016/2/28.
 */
public class MyUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {
    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.out.println("caught " + e);
    }
}
