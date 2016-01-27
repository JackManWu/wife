package com.jackman.thread;

import java.util.concurrent.Callable;

/**
 * Created by wujinlei on 2016/1/26.
 */
public class TaskWithResult implements Callable<String> {
    private int id;

    public TaskWithResult(int id) {
        this.id = id;
    }

    public String call() throws Exception {
        return "Result of TaskWithResult " + id;
    }
}
