package com.jackman.thread;

/**
 * Created by JackManWu on 2016/6/15.
 */
public class SerialNumberGenerator {
    private static volatile int serialNumber = 0;

    public static int nextSerialNumber() {
        return serialNumber++;
    }
}
