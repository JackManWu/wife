package com.jackman.spring.pojo;

import lombok.Setter;

/**
 * Created by JackManWu on 2016/7/25.
 */
@Setter
public class Cat {
    private static Cat cat = new Cat();

    private String color;

    private String weight;

    private Cat() {
    }

    public Cat getInstance(Animals animals) {
        cat.setColor(animals.getColor());
        cat.setWeight(animals.getWeight());
        return cat;
    }
}
