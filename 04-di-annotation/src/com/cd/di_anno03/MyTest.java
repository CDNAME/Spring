package com.cd.di_anno03;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:com/cd/di_anno03/applicationContext.xml")
public class MyTest {
    @Autowired
    private Student student;
    @Autowired
    private School school;
    
    @Test
    public void test01() {
        System.out.println(student);
    }
    @Test
    public void test02() {
        System.out.println(school);
    }
}
