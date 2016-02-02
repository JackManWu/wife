package com.jackman.design.pattern.建造模式;

/**
 * Created by JackMan on 2016/2/2.
 */
public class Client {
    public static void main(String[] args) {
        Builder builder = new ConcreateBuilder();
        Director director = new Director(builder);
        director.construct();
        Product product = builder.retrieveResult();
        System.out.println(product.getPart1());
        System.out.println(product.getPart2());
    }
}
