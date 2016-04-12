package com.jackman.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by JackMan on 2016/2/28.
 */
public class ExceptionThread implements Runnable {
    @Override
    public void run() {
        throw new RuntimeException();
    }

    public static void main(String[] args) {
        try {
            ExecutorService service = Executors.newCachedThreadPool();
            service.execute(new ExceptionThread());
        } catch (RuntimeException e) {
            System.out.println("Exception has been handled!");
        }
    }
}
