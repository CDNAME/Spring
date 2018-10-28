package com.cd.di10;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test01() {
        //创建容器对象,加载Spring配置文件
        String resource = "com/cd/di10/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(resource);
        
        Student student = (Student) ac.getBean("myStudent");
        System.out.println(student);
    }
}
