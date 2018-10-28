package com.cd.ba03;

public class SomeServiceImpl implements ISomeService {
    public SomeServiceImpl() {
        System.out.println("执行了无参构造器");
    }
    @Override
    public void doSome() {
        System.out.println("执行了doSome()方法");
    }
}
