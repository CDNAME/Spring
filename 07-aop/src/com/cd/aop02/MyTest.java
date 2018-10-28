package com.cd.aop02;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test01() {
        //创建容器对象,加载Spring配置文件
        String resource = "com/cd/aop02/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(resource);
        ISomeService service = (ISomeService)ac.getBean("serviceProxy");
        try {
            service.login("beijing","111");
        } catch (UserException e) {
            e.printStackTrace();
        }
    }
}
