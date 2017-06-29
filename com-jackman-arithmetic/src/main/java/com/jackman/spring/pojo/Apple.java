package com.jackman.spring.pojo;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * Created by JackMan on 2016/4/20.
 */
@Setter
@Getter
public class Apple {
    private Properties administrator;

    private List<Object> someList;

    private Map<String,Object> someMap;

    private Set<Object> someSet;
}
