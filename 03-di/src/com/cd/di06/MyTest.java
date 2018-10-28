package com.cd.di06;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test01() {
        //创建容器对象,加载Spring配置文件
        String resource = "com/cd/di06/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(resource);
        Some some = (Some)ac.getBean("mySome");
        System.out.println(some);
    }
}
