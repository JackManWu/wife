package com.jackman.other;

import java.util.Iterator;

/**
 * Created by JackManWu on 2017/2/17.
 */
public class Letters implements Generator<Pair<Integer, String>>, Iterable<Integer> {
    private int size = 9;
    private int number = 1;

    private char letter = 'A';

    @Override
    public Pair<Integer, String> next() {
        return new Pair<>(number++, "" + letter++);
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return number < size;
            }

            @Override
            public Integer next() {
                return number++;
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    public static void main(String[] args) {
        System.out.println(MapData.map(new Letters(),11));
        System.out.println(MapData.map(new Letters(),"Pop"));
    }
}
