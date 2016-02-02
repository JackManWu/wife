package com.jackman.design.pattern.建造模式;

/**
 * Created by JackMan on 2016/2/2.
 */
public class GoodbyeBuilder extends Builders {
    public GoodbyeBuilder() {
        msg = new GoodbyeMessage();
    }

    @Override
    public void buildSubject() {
        msg.setSubject("欢送标题");
    }

    @Override
    public void buildBody() {
        msg.setBody("欢送内容");
    }
}
