package com.jackman.design.pattern.建造模式;

/**
 * Created by JackMan on 2016/2/2.
 */
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.buildPart1();
        builder.buildPart2();
    }
}
