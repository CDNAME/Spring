package com.cd.test;

import com.cd.beans.Student;
import com.cd.service.IStudentService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest {
    private IStudentService service;
    @Before
    public void before() {
        //创建容器对象，加载Spring配置文件
        String resource = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(resource);
        service = (IStudentService) ac.getBean("studentService");
    }
    @Test
    public void test01() {
        Student student = new Student("张三M",23);
        service.addStudent(student);
    }
    @Test
    public void test02() {
        service.removeById(34);
    }
    @Test
    public void test03() {
        Student student = new Student("张三五",23);
        student.setId(3);
        service.modifyStudent(student);
    }
    @Test
    public void test04() {
        List<String> names = service.findAllStudentNames();
        System.out.println(names);
    }
    @Test
    public void test05() {
        String name = service.findStudentNameById(3);
        System.out.println(name);
    }
    @Test
    public void test06() {
        List<Student> students = service.findAllStudent();
        for (Student student : students) {
            System.out.println(student);
        }
    }
    @Test
    public void test07() {
        Student student = service.findStudentById(3);
            System.out.println(student);
    }
}
