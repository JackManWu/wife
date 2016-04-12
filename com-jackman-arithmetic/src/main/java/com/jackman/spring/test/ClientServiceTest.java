package com.jackman.spring.test;

import com.jackman.spring.pojo.ExampleABean;
import com.jackman.spring.pojo.ExampleBean;
import com.jackman.spring.service.AccountService;
import com.jackman.spring.service.ClientService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by JackMan on 2016/4/11.
 */
public class ClientServiceTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"service.xml", "bean.xml"});
        /*ClientService clientService = context.getBean("clientService", ClientService.class);
        System.out.println("数据：" + clientService.toString());

        AccountService accountService = context.getBean("accountService", AccountService.class);
        System.out.println("sss:" + accountService.toString());*/
        ExampleBean exampleBean = context.getBean("exampleBean", ExampleBean.class);
        System.out.println("数据：" + exampleBean.getYear() + "--" + exampleBean.getUltimateAnswer());

        ExampleBean exampleBean1 = context.getBean("exampleBean1", ExampleBean.class);
        System.out.println("数据：" + exampleBean1.getYear() + "--" + exampleBean1.getUltimateAnswer());

        ExampleBean exampleBean2 = context.getBean("exampleBean2", ExampleBean.class);
        System.out.println("数据：" + exampleBean2.getYear() + "--" + exampleBean2.getUltimateAnswer());

    }
}
