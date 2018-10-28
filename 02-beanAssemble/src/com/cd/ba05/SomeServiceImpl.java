package com.cd.ba05;

public class SomeServiceImpl implements ISomeService {
    @Override
    public String doSome() {
        System.out.println("执行了doSome()方法");
        return "abcde";
    }

    @Override
    public String doOther() {
        System.out.println("执行了doOther()方法");
        return "fghij";
    }
}
