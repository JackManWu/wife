package com.jackman.design.pattern.简单工厂模式;

/**
 * Created by JackMan on 2016/1/8.
 */
public class DomainLogin implements Login{
    @Override
    public boolean verify(String name, String password) {
        return false;
    }
}
