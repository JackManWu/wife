package com.jackman.other;

import org.joda.time.DateTime;

/**
 * Created by JackManWu on 2016/12/7.
 */
public class RedApple extends Apple {
    private String name="redApple";

    private int age=  20;

    private DateTime dateTime;

    public RedApple(DateTime dateTime) {
        this.dateTime = dateTime;
    }

    public DateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(DateTime dateTime) {
        this.dateTime = dateTime;
    }
}
