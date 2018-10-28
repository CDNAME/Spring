package com.cd.test;

import com.cd.service.BuyStockException;
import com.cd.service.IBuyStockService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    private IBuyStockService service;
    
    @Before
    public void before() {
        //创建容器对象，加载Spring配置文件
        String resource = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(resource);
        service = (IBuyStockService)ac.getBean("serviceProxy");
    }

    @Test
    public void test01() {
        service.openAcount("张三", 10000);
        service.openStock("海师613", 0);
    }
    @Test
    public void test02() {
        try {
            service.buyStock("张三", 2000, "海师613", 5);
        } catch (BuyStockException e) {
            e.printStackTrace();
        }
    }
}
