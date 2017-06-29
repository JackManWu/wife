package com.jackman.spring.pojo;

import lombok.Getter;

import java.beans.ConstructorProperties;

/**
 * Created by JackMan on 2016/4/11.
 */
@Getter
public class ExampleBean {
    private int year;
    private String ultimateAnswer;

    @ConstructorProperties({"year", "ultimateAnswer"})
    public ExampleBean(int year, String ultimateAnswer) {
        this.year = year;
        this.ultimateAnswer = ultimateAnswer;
    }
}
