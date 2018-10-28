package com.cd.test;

import com.cd.service.ISomeService;
import com.cd.service.SomeServiceImpl;

public class MyTest {
    public static void main(String[] args) {
        ISomeService service = new SomeServiceImpl();
        service.doFirst();
        System.out.println("===================");
        service.doSecond();
    }
}
