package com.jackman.spring.test;

import com.jackman.spring.service.EatService;
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
        /*ExampleBean exampleBean = context.getBean("exampleBean", ExampleBean.class);
        System.out.println("数据：" + exampleBean.getYear() + "--" + exampleBean.getUltimateAnswer());

        ExampleBean exampleBean1 = context.getBean("exampleBean1", ExampleBean.class);
        System.out.println("数据：" + exampleBean1.getYear() + "--" + exampleBean1.getUltimateAnswer());

        ExampleBean exampleBean2 = context.getBean("exampleBean2", ExampleBean.class);
        System.out.println("数据：" + exampleBean2.getYear() + "--" + exampleBean2.getUltimateAnswer());*/

        /*Fruit fruit = context.getBean("fruit", Fruit.class);
        System.out.println("数据：" + fruit.getApple());

        Apple apple = context.getBean("apple1", Apple.class);
        System.out.println("apple: " + apple.getAdministrator().toString() + "--" + apple.getSomeList().toString() + "--" + apple.getSomeMap().toString() + "--" + apple.getSomeSet().toString());
        BasicDataSource source = (BasicDataSource) apple.getSomeList().get(1);
        System.out.println("源："+source.getUrl()+"-"+source.getUsername());*/

//        AccountService service = context.getBean("child",AccountService.class);
//        System.out.println(service.getAdministrator());

//        ExampleBean exampleBean = context.getBean("exampleBeanC",ExampleBean.class);
//        MyValueCalcutor calcutor = context.getBean("myValueCalcutor",MyValueCalcutor.class);
//        System.out.println(calcutor.computeValue("aiyou"));
//        System.out.println();

       /* CommondManager manager = context.getBean("commondManager",CommondManager.class);
        System.out.println(manager.process((Map) new HashMap().put("hello","aiyou")));*/
        String[] beans = context.getBeanNamesForType(EatService.class);
        System.out.println(beans.length);
        for (String str : beans) {
            System.out.println(str);
        }
    }
}
