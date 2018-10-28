package com.cd.di_anno03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Scope("prototype")
@Component("myStudent")
public class Student {
    @Value("陈登")
    private String name;
    @Value("23")
    private int age;
    @Autowired      //byType方式的注解注入
//    @Autowired
//    @Qualifier("mySchool")  //byName方式的注解注入,要求@Autowired和@Qualifier两个注解联合使用
    
//    @Resource(name="mySchool")  //byName方式的注解注入
//    @Resource  //byType方式的注解注入
    private School school;  //对象属性，域属性

    public void setName(String name) {
        System.out.println("执行setName()");
        this.name = name;
    }

    public void setAge(int age) {
        System.out.println("执行setAge()");
        this.age = age;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }
    
//    @PostConstruct
//    public void initAfter() {
//        System.out.println("当前Bean初始化刚完毕");
//    }
//    
//    @PreDestroy
//    public void preDestory() {
//        System.out.println("当前Bean即将被销毁");   
//    }
}
