package com.jackman.design.pattern.简单工厂模式;

/**
 * Created by JackMan on 2016/1/8.
 */
public class LoginManager {
    public static Login factory(String type) {
        if (type.equals("password")) {
            return new PasswordLogin();
        } else if (type.equals("passcode")) {
            return new DomainLogin();
        } else {
            throw new RuntimeException("没有找到登录类型");
        }
    }
}
