package com.jackman.thread;

/**
 * Created by JackMan on 2016/1/27.
 */
public class DaemonSpawn implements Runnable{
    public void run() {
        while (true){
            Thread.yield();
        }
    }
}
