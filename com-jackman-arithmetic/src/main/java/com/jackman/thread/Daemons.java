package com.jackman.thread;

import java.util.concurrent.TimeUnit;

/**
 * Created by JackMan on 2016/1/27.
 */
public class Daemons {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Daemon());
        thread.setDaemon(true);
        thread.start();
        System.out.println("thread.isDaemon()=" + thread.isDaemon() + ".");
        TimeUnit.SECONDS.sleep(1);
    }
}
