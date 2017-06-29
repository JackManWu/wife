package com.jackman.other;

import org.quartz.*;

/**
 * Created by JackManWu on 2016/12/12.
 */
public class HelloJob implements Job{
    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        System.out.println("hello");
        JobKey jobKey = context.getJobDetail().getKey();
        System.out.println("key: "+jobKey);
        JobDataMap dataMap = context.getJobDetail().getJobDataMap();
        for (String key:dataMap.keySet()){
            Object o = dataMap.get(key);
            System.out.println(o);
        }
    }
}
