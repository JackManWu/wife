package com.jackman.design.pattern.建造模式;

import java.util.Date;

/**
 * Created by JackMan on 2016/2/2.
 */
public abstract class Builders {
    protected AutoMessage msg;

    public abstract void buildSubject();

    public abstract void buildBody();

    public void buildTo(String to) {
        msg.setTo(to);
    }

    public void buildFrom(String from) {
        msg.setFrom(from);
    }

    public void buildSendDate() {
        msg.setSendDate(new Date());
    }

    public void sendMessage() {
        msg.send();
    }
}
