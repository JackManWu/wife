package com.jackman.design.pattern.建造模式;

/**
 * Created by JackMan on 2016/2/2.
 */
public class WelcomeBuilder extends Builders {
    public WelcomeBuilder() {
        msg = new WelcomeMessage();
    }

    @Override
    public void buildSubject() {
        msg.setSubject("欢迎标题");
    }

    @Override
    public void buildBody() {
        msg.setBody("欢迎内容");
    }
}
