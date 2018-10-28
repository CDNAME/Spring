package com.cd.test;

import com.cd.proxy.ServiceProxy;
import com.cd.service.ISomeService;
import com.cd.service.SomeServiceImpl;

public class MyTest {
    public static void main(String[] args) {
        ISomeService target = new SomeServiceImpl();
        ISomeService target1 = new SomeServiceImpl();
        
        ISomeService service = new ServiceProxy(target);
        String result = service.doFirst();
        System.out.println(result);
        service.doSecond();
        
        System.out.println("-------------------------");
        
        String result1 = target1.doFirst();
        System.out.println(result1);
        target1.doSecond();
    }
}
