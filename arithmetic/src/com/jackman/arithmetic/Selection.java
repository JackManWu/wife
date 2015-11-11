package com.jackman.arithmetic;

import com.jackman.util.Exchange;

/**
 * Created by wujinlei on 2015/11/11.
 */
public class Selection {
    public static void sort(int[] a) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            int min = i;
            for (int j = i + 1; j < N; j++) {
                if (Exchange.compare(a, i, j)) {
                    min = j;
                }
                Exchange.exchange(a, i, min);
            }
        }
    }
}
