package com.jackman.algorithm;

/**
 * Created by JackMan on 2015/12/29.
 * 插入排序
 */
public class InsertSortImpl implements SortInterface {

    @Override
    public void sort(int[] a) {
        int len = a.length;
        for (int i = 1; i < len; i++) {
            int temp = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > temp) {
                a[j + 1] = a[j];
                j -= 1;
            }
            a[j + 1] = temp;
        }
    }
}
