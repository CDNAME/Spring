package com.cd.di11;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test01() {
        //创建容器对象,加载Spring配置文件
        String resource = "com/cd/di11/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(resource);
        
        Student student = (Student) ac.getBean("myStudent");
        System.out.println(student);
        Student student2 = (Student) ac.getBean("myStudent2");
        System.out.println(student2);
        Student student3 = (Student) ac.getBean("myStudent3");
        System.out.println(student3);
//        Student basestudent = (Student) ac.getBean("baseStudent");
//        System.out.println(basestudent);
    }
}
