package com.jackman.thread;

/**
 * Created by JackManWu on 2016/6/12.
 */
public class EvenGenrator extends IntGenerator{
    private int currentEvenValue=0;
    @Override
    public int next() {
        ++currentEvenValue;
        Thread.yield();
        ++currentEvenValue;
        return currentEvenValue;
    }
    public static void main(String[] args){
        EvenChecker.test(new EvenGenrator());
    }
}
