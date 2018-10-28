package com.cd.ba06;

public class SomeServiceImpl implements ISomeService {
    public SomeServiceImpl() {
        System.out.println("执行了无参构造器");
    }
    @Override
    public void doSome() {
        System.out.println("执行了doSome()方法");
    }
    
    public void setUp() {
        System.out.println("生命起始");
    }
    
    public void tearDown() {
        System.out.println("销毁之前");
    }
}
