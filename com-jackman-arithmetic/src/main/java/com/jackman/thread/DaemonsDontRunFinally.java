package com.jackman.thread;

/**
 * Created by JackMan on 2016/1/27.
 */
public class DaemonsDontRunFinally {
    public static void main(String[] args) {
        Thread thread = new Thread(new Adaemon());
//        thread.setDaemon(true);
        thread.start();
    }
}
