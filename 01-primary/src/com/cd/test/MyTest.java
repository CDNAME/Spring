package com.cd.test;

import com.cd.service.ISomeService;
import com.cd.service.SomeServiceImpl;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class MyTest {
    @Test
    public void test01() {
        ISomeService service = new SomeServiceImpl();
        service.doSome();
    }
    
    @Test
    public void test02() {
        //创建容器对象,加载Spring配置文件
        //默认从项目类路径下查找配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        ISomeService service = (ISomeService) ac.getBean("myService");
        service.doSome();
    }
    @Test
    public void test03() {
        //创建容器对象，加载Spring配置文件
        //默认从根目录下查找配置文件
        ApplicationContext ac = new FileSystemXmlApplicationContext("applicationContext.xml");
        ISomeService service = (ISomeService) ac.getBean("myService");
        service.doSome();
    }
    @Test
    public void test04() {
        //创建容器对象，加载Spring配置文件
        //从当前文件系统的D盘根目录下查找配置文件
        ApplicationContext ac = new FileSystemXmlApplicationContext("d:/applicationContext.xml");
        ISomeService service = (ISomeService) ac.getBean("myService");
        service.doSome();
    }
    
    /*
     * ApplicationContext与BeanFactory容器的区别
     * 这两个容器对于其中的Bean的创建时机不同
     * 1）Application容器在进行初始化时，会将其中所有的Bean(对象)进行创建
     *      缺点：占用系统资源（CPU，内存）
     *      优点：响应速度快
     * 2）BeanFactory容器中的对象，在容器初始化时并不会被创建，而是真正获取该对象时才被创建
     *      缺点：相对来说，响应速度慢
     *      优点：不多占用系统资源
     */     
    
    @Test
    public void test05() {
        //创建BeanFactory容器
        BeanFactory bf = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
        ISomeService service = (ISomeService) bf.getBean("myService");
        service.doSome();
    }
}
