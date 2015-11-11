package com.jackman;

import com.jackman.arithmetic.Selection;

/**
 * Created by wujinlei on 2015/11/11.
 */
public class Main {
    public static void main(String[] args) {
        int a[] = {-1, 23, 1, 45, 2};
        Selection.sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
