package com.cd.di_anno02;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration          //表示当前类充当spring容器，即所有的Bean将由这个类创建
public class MyJavaConfig {
    @Bean(name="school")
    public School mySchoolCreator() {
        return new School("北京大学");
    }
    //autowire= Autowire.BY_TYPE指从当前类的这个容器中查找与域属性的类型具有is-a关系的Bean
    /*
    @Bean(name="myStudent", autowire= Autowire.BY_TYPE)
    public Student myStudentCreator() {
        return new Student("王二", 23);
    }
    */
    //autowire= Autowire.BY_NAME指从当前类的这个容器中查找与域属性同名的Bean
    @Bean(name="myStudent", autowire= Autowire.BY_NAME)
    public Student myStudentCreator() {
        return new Student("王二", 23);
    }
}
