package com.cd.service;

//目标类：代理类要增强的类
public class SomeServiceImpl implements ISomeService {
    @Override
    public String doFirst() {
        System.out.println("执行都doFirst()方法");
        return "abc";
    }

    @Override
    public void doSecond() {
        System.out.println("执行都doSecond()方法");
    }
}
