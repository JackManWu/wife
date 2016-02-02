package com.jackman.design.pattern.建造模式;

/**
 * Created by JackMan on 2016/2/2.
 */
public class Directors {
    Builders builders;

    public Directors(Builders builders) {
        this.builders = builders;
    }

    public void construct(String toAddress, String fromAddress) {
        this.builders.buildTo(toAddress);
        this.builders.buildFrom(fromAddress);
        this.builders.buildSubject();
        this.builders.buildBody();
        this.builders.buildSendDate();
        this.builders.sendMessage();
    }
}
