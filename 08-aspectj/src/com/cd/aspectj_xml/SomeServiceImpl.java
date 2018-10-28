package com.cd.aspectj_xml;


public class SomeServiceImpl implements ISomeService {
    @Override
    public void doFirst() {
        System.out.println("执行doFirst()方法");
    }

    @Override
    public String doSecond() {
        System.out.println("执行doSecond()方法");
        return "abcde";
    }

    @Override
    public void doThird() {
        //System.out.println("执行doThird()方法" + 3/0);
        System.out.println("执行doThird()方法");
    }
}
