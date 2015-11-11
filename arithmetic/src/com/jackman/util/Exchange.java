package com.jackman.util;

/**
 * Created by wujinlei on 2015/11/11.
 */
public class Exchange {
    public static boolean compare(int[] a, int i, int j) {
        if (a[i] > a[j]) {
            return true;
        } else {
            return false;
        }
    }

    public static void exchange(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
