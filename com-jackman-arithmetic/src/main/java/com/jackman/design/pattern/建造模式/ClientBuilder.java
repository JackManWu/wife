package com.jackman.design.pattern.建造模式;

/**
 * Created by JackMan on 2016/2/2.
 */
public class ClientBuilder {
    public static void main(String[] args) {
        Builders builders = new WelcomeBuilder();
        Directors directors = new Directors(builders);
        directors.construct("toAddress@126.com", "fromAddress@126.com");
    }
}
