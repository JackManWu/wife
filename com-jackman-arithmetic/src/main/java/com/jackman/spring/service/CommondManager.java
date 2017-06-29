package com.jackman.spring.service;

import com.jackman.spring.pojo.Commond;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.Map;

/**
 * Created by JackManWu on 2016/7/25.
 */
public class CommondManager implements ApplicationContextAware {
    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public Object process(Map commondState){
        Commond commond = createCommond();
        commond.setState(commondState);
        return commond.execute();
    }

    protected Commond createCommond(){
        return this.applicationContext.getBean("commond",Commond.class);
    }
}
