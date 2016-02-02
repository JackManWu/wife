package com.jackman.design.pattern.建造模式;

/**
 * Created by JackMan on 2016/2/1.
 */
public interface Builder {
    void buildPart1();

    void buildPart2();

    Product retrieveResult();
}
