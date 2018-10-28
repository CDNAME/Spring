package com.cd.proxy;

import com.cd.service.ISomeService;
import com.cd.service.SomeServiceImpl;

//静态代理类
public class ServiceProxy implements ISomeService {
    private ISomeService target;

    public ServiceProxy() {
        target = new SomeServiceImpl();
    }

    public ServiceProxy(ISomeService target) {
        this.target = target;
    }

    @Override
    public String doFirst() {
        //调用目标对象的目标方法，该方法返回的是全小写字母
        String result = (target.doFirst()).toUpperCase();
        //增强：将目标方法返回的全小写字母变为全大写
        return result;
    }

    @Override
    public void doSecond() {
        target.doSecond();
    }
}
