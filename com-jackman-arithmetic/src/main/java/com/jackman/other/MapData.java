package com.jackman.other;

import java.util.LinkedHashMap;

/**
 * Created by JackManWu on 2017/2/17.
 */
public class MapData<K, V> extends LinkedHashMap<K, V> {
    public MapData(Generator<Pair<K, V>> gen, int quality) {
        for (int i = 0; i < quality; i++) {
            Pair<K, V> p = gen.next();
            put(p.key, p.value);
        }
    }

    public MapData(Generator<K> genK, Generator<V> genV, int quality) {
        for (int i = 0; i < quality; i++) {
            put(genK.next(), genV.next());
        }
    }

    public MapData(Generator<K> genK, V value, int quality) {
        for (int i = 0; i < quality; i++) {
            put(genK.next(), value);
        }
    }

    public MapData(Iterable<K> genK, Generator<V> genV) {
        for (K key : genK) {
            put(key, genV.next());
        }
    }

    public MapData(Iterable<K> genK, V value) {
        for (K key : genK) {
            put(key, value);
        }
    }

    public static <K, V> MapData<K, V> map(Generator<Pair<K, V>> gen, int quality) {
        return new MapData<K, V>(gen, quality);
    }

    public static <K, V> MapData<K, V> map(Generator<K> genK, Generator<V> genV, int quality) {
        return new MapData<K, V>(genK, genV, quality);
    }

    public static <K, V> MapData<K, V> map(Generator<K> genK, V value, int quality) {
        return new MapData<K, V>(genK, value, quality);
    }

    public static <K, V> MapData<K, V> map(Iterable<K> genK, Generator<V> genV) {
        return new MapData<K, V>(genK, genV);
    }

    public static <K, V> MapData<K, V> map(Iterable<K> genK, V value) {
        return new MapData<K, V>(genK, value);
    }
}
