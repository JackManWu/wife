package com.jackman.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by wujinlei on 2016/1/26.
 */
public class SleepingTask extends LiftOff{
    @Override
    public void run() {
        try {
            while (countDown-- >0){
                System.out.println(status());
                TimeUnit.MILLISECONDS.sleep(1000);
            }
        }catch (InterruptedException e){
            System.err.println("Interrupted");
        }
    }

    public static void main(String[] args){
        ExecutorService service = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            service.execute(new SleepingTask());
        }
        service.shutdown();
    }
}
