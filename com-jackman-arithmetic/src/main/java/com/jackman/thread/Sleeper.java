package com.jackman.thread;

/**
 * Created by JackMan on 2016/2/26.
 */
public class Sleeper extends Thread {
    private int duration;

    public Sleeper(String name, int sleepTime) {
        super(name);
        duration = sleepTime;
        start();
    }

    @Override
    public void run() {
        try {
            sleep(duration);
        } catch (InterruptedException e) {
            System.out.println(getName()+" was interrupted. "+" isInterrupted(): "+isInterrupted());
        }
        System.out.println(getName()+" has awakened");
    }
}
