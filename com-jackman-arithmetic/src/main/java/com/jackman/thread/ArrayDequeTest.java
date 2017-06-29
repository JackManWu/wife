package com.jackman.thread;

import java.util.ArrayDeque;

/**
 * Created by JackManWu on 2016/6/27.
 */
public class ArrayDequeTest {
    public static void main(String[] args){
        ArrayDeque<String> arrayDeque =new ArrayDeque<>();
        arrayDeque.addFirst("hello");
        arrayDeque.addFirst("world");
        System.out.println(arrayDeque.pollFirst());
        System.out.println(arrayDeque.peekFirst());
    }
}
