package com.jackman.other;

/**
 * Created by JackManWu on 2016/10/31.
 */
public class AccountImpl implements Account {
    @Override
    public void operation() {
        System.out.println("hello,proxy!");
    }
}
