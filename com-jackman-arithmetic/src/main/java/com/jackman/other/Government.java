package com.jackman.other;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by JackManWu on 2017/2/17.
 */
public class Government implements Generator<String> {
    String[] foundation = ("Strange women lying in pounds " + "distributing swords is no basis for a sustem of " +
            "government").split(" ");

    private int index;

    @Override
    public String next() {
        return foundation[index++];
    }

    public static void main(String[] args) {
        Set<String> set  =new LinkedHashSet<>(new CollectionData<>(new Government(),10));
//        set.addAll(CollectionData.list(new Government(),15));
        System.out.println(set);
    }
}
