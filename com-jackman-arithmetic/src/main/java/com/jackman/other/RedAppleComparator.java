package com.jackman.other;

import java.util.Comparator;

/**
 * Created by JackManWu on 2016/12/8.
 */
public class RedAppleComparator implements Comparator<RedApple> {
    @Override
    public int compare(RedApple o1, RedApple o2) {
        if (o1.getDateTime().isAfter(o2.getDateTime())) {
            return -1;
        }else {
            return 1;
        }
    }
}
