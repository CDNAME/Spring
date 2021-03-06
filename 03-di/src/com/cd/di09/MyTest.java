package com.cd.di09;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Random;

public class MyTest {
    @Test
    public void test01() {
        //创建容器对象,加载Spring配置文件
        String resource = "com/cd/di09/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(resource);
        Person person = (Person)ac.getBean("myPerson");
        System.out.println(person);
        
        Student student = (Student) ac.getBean("myStudent");
        System.out.println(student);
    }
}
