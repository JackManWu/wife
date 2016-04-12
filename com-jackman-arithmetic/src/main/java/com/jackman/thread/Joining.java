package com.jackman.thread;

/**
 * Created by JackMan on 2016/2/26.
 */
public class Joining {
    public static void main(String[] args) {
        Sleeper sleepy = new Sleeper("Sleepy", 1500),
                grumpy = new Sleeper("Grumpy", 1500);
        Joiner dopey = new Joiner("Doepy", sleepy),
                doc = new Joiner("Doc", grumpy);
        grumpy.interrupt();
    }
}
