package com.cd.cglib;

import com.cd.service.ISomeService;

//目标类：没有实现任何接口
public class SomeService {
    public String doFirst() {
        System.out.println("执行都doFirst()方法");
        return "abc";
    }

    public void doSecond() {
        System.out.println("执行都doSecond()方法");
    }
}
