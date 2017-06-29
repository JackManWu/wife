package com.jackman.other;

import java.util.ArrayList;

/**
 * Created by JackManWu on 2017/2/17.
 */
public class CollectionData<T> extends ArrayList<T> {
    public CollectionData(Generator<T> gen, int quality) {
        for (int i = 0; i < quality; i++) {
            add(gen.next());
        }
    }

    public static <T> CollectionData<T> list(Generator<T> gen, int quality) {
        return new CollectionData<>(gen, quality);
    }
}
