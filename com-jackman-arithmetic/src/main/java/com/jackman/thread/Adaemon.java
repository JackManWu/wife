package com.jackman.thread;

import java.util.concurrent.TimeUnit;

/**
 * Created by JackMan on 2016/1/27.
 */
public class Adaemon implements Runnable{
    public void run() {
        try {
            System.out.println("Starting Adaemon");
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            System.out.println("Exiting via InterruptedException");
        }finally {
            System.out.println("This should always run?");
        }
    }
}
