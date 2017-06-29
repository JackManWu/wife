package com.jackman.other;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

import java.util.Date;

import static org.quartz.CronScheduleBuilder.cronSchedule;
import static org.quartz.JobBuilder.newJob;
import static org.quartz.TriggerBuilder.newTrigger;
import static org.quartz.TriggerKey.triggerKey;

/**
 * Created by JackManWu on 2016/12/12.
 */
public class SchedulerTest {

    public static void main(String[] args) throws Exception {
        SchedulerFactory schedulerFactory = new StdSchedulerFactory();
        Scheduler scheduler = schedulerFactory.getScheduler();
        scheduler.start();

        JobDataMap jobDataMap = new JobDataMap();
        jobDataMap.put("name","wujinlei");
        jobDataMap.put("age",12);

        JobDetail jobDetail = newJob(HelloJob.class)
                .withIdentity("myjob","group1")
                .storeDurably().usingJobData(jobDataMap)
                .build();

        Trigger trigger = newTrigger()
                .withIdentity("myTrigger", "group1")
                .withSchedule(cronSchedule("40 * * * * ?"))
                .build();


        scheduler.scheduleJob(jobDetail,trigger);

        JobKey jobKey = new JobKey("myjob","group1");
        boolean isExist = scheduler.checkExists(jobKey);
        System.out.println(isExist);

        if(isExist){
            Trigger oldTrigger  =scheduler.getTrigger(triggerKey("myTrigger","group1"));
            TriggerBuilder builder =  oldTrigger.getTriggerBuilder();
            Trigger newTrigger = builder.withSchedule(cronSchedule("10 * * * * ?")).build();
           Date date =  scheduler.rescheduleJob(oldTrigger.getKey(),newTrigger);
            System.out.println(date);

            JobDetail jobDetail1  =newJob(HelloJob.class)
                    .withIdentity("youtJob","group2")
                    .storeDurably().usingJobData(jobDataMap)
                    .build();
            Trigger trigger1 = newTrigger()
                    .withIdentity("youtJob","group2")
                    .withSchedule(cronSchedule("10 * * * * ?"))
                    .build();
            scheduler.scheduleJob(jobDetail1,trigger1);
        }
    }
}
