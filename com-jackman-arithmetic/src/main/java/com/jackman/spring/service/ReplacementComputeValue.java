package com.jackman.spring.service;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

/**
 * Created by JackManWu on 2016/7/25.
 */
public class ReplacementComputeValue implements MethodReplacer{
    @Override
    public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
        return args[0];
    }
}
