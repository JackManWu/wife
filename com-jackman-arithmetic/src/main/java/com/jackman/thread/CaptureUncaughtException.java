package com.jackman.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by JackMan on 2016/2/28.
 */
public class CaptureUncaughtException {
    public static void main(String[] args) {
        ExecutorService service = Executors.newCachedThreadPool(new HandlerThreadFactory());
        service.execute(new ExceptionThread2());
    }
}
