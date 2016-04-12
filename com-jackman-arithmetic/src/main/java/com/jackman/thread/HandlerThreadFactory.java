package com.jackman.thread;

import java.util.concurrent.ThreadFactory;

/**
 * Created by JackMan on 2016/2/28.
 */
public class HandlerThreadFactory implements ThreadFactory {
    @Override
    public Thread newThread(Runnable r) {
        System.out.println(this + " creating new Thread");
        Thread thread = new Thread();
        System.out.println("created " + thread);
        thread.setUncaughtExceptionHandler(new MyUncaughtExceptionHandler());
        System.out.println("eh  = " + thread.getUncaughtExceptionHandler());
        return thread;
    }
}
