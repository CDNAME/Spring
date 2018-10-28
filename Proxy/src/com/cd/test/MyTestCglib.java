package com.cd.test;

import com.cd.cglib.CglibFactory;
import com.cd.cglib.SomeService;

public class MyTestCglib {
    public static void main(String[] args) {
        SomeService target = new SomeService();
        SomeService service = new CglibFactory(target).myCglibCreator();
        String result = service.doFirst();
        System.out.println(result);
        service.doSecond();
        
    }
}
