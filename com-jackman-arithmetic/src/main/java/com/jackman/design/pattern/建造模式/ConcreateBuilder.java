package com.jackman.design.pattern.建造模式;

/**
 * Created by JackMan on 2016/2/1.
 */
public class ConcreateBuilder implements Builder {
    private Product product = new Product();

    public void buildPart1() {
        product.setPart1("编号：9527");
    }

    public void buildPart2() {
        product.setPart2("名称：XXX");
    }

    public Product retrieveResult() {
        return product;
    }
}
