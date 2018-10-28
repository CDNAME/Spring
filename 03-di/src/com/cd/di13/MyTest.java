package com.cd.di13;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test01() {
        //创建容器对象,加载Spring配置文件
        /*
        String resource = "com/cd/di13/spring-base.xml";
        String resource2 = "com/cd/di13/spring-beans.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(resource, resource2);
        */
        /*
        String resource = "com/cd/di13/spring-base.xml";
        String resource2 = "com/cd/di13/spring-beans.xml";
        String[] resources = {resource, resource2};
        ApplicationContext ac = new ClassPathXmlApplicationContext(resources);
        */
        String resource = "com/cd/di13/spring-*.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(resource);
        
        Student student = (Student) ac.getBean("myStudent");
        System.out.println(student);
        Teacher teacher = (Teacher) ac.getBean("myTeacher");
        System.out.println(teacher);
    }
}
