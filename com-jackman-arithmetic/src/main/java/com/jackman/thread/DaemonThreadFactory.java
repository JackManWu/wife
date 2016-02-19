package com.jackman.thread;

import java.util.concurrent.ThreadFactory;

/**
 * Created by JackMan on 2016/1/27.
 */
public class DaemonThreadFactory implements ThreadFactory{
    public Thread newThread(Runnable r) {
        Thread thread = new Thread(r);
        thread.setDaemon(true);
        return thread;
    }
}
