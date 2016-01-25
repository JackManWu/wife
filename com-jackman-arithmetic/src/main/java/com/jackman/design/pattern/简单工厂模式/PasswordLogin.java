package com.jackman.design.pattern.简单工厂模式;

/**
 * Created by wujinlei on 2016/1/8.
 */
public class PasswordLogin implements Login {
    @Override
    public boolean verify(String name, String password) {
        System.out.println(name + "," + password);
        return false;
    }
}
