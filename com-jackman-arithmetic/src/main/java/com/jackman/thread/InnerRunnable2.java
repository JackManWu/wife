package com.jackman.thread;

import java.util.concurrent.TimeUnit;

/**
 * Created by JackMan on 2016/2/2.
 */
public class InnerRunnable2 {
    private int countDown = 5;
    private Thread t;

    public InnerRunnable2(String name) {
        t = new Thread(new Runnable() {
            public void run() {
                try {
                    while (true) {
                        System.out.println(this);
                        if (--countDown == 0) {
                            return;
                        }
                        TimeUnit.MILLISECONDS.sleep(10);
                        System.out.println();
                    }
                } catch (InterruptedException e) {
                    System.out.println("sleep interrupted");
                }
            }

            @Override
            public String toString() {
                return Thread.currentThread().getName() + "： " + countDown;
            }
        }, name);
        t.start();
    }
}
