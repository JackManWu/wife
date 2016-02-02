package com.jackman.thread;

/**
 * Created by JackMan on 2016/2/2.
 */
public class ThreadVariations {
    public static void main(String[] args) {
        new InnerThread1("InnerThread1");
        new InnerThread2("InnerThread2");
        new InnerRunable1("InnerRunable1");
        new InnerRunnable2("InnerRunable2");
        new ThreadMethod("ThreadMethod").runTask();
    }
}
