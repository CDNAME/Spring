package com.cd.service;

import org.springframework.util.SocketUtils;

public class SomeServiceImpl implements ISomeService {
   //private int a = 5;
    
    //一个没有成员变量的对象在堆内存中占用8个字节
    //Object o = new Object();
    
    //动态代码块·
//    {
//        System.out.println("执行了动态代码块a = " + a);
//    }
    
    public SomeServiceImpl() {
        System.out.println("执行无参构造器");
    }
    @Override
    public void doSome() {
        System.out.println("执行了doSome()方法");
    }
}
