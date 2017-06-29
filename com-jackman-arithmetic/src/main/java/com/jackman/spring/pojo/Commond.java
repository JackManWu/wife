package com.jackman.spring.pojo;

import lombok.Setter;

import java.util.Map;

/**
 * Created by JackManWu on 2016/7/25.
 */
@Setter
public class Commond {
    Map<String,String> state;

    public Object execute() {
        return state.keySet();
    }
}
