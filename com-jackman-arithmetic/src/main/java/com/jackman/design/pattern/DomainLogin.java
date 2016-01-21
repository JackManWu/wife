package com.jackman.design.pattern;

/**
 * Created by wujinlei on 2016/1/8.
 */
public class DomainLogin implements Login{
    @Override
    public boolean verify(String name, String password) {
        return false;
    }
}
