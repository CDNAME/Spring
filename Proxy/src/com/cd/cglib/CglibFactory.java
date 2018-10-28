package com.cd.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

//注意，使用cglib动态代理，要求目标类不能是final的
//因为final类是不能有子类的，而cglib动态代理增强的原理是，子类增强父类
public class CglibFactory implements MethodInterceptor {
    private SomeService target;

    public CglibFactory() {
    }

    public CglibFactory(SomeService target) {
        this.target = target;
    }

    public SomeService myCglibCreator() {
        Enhancer enhancer = new Enhancer();
        //指定父类即目标类，因为cglib动态代理增强的原理是，子类增强父类
        enhancer.setSuperclass(SomeService.class);
        //设置回调接口对象
        enhancer.setCallback(this);
        //create()方法用于创建Cglib动态代理对象，即目标类的子类对象
        return (SomeService) enhancer.create();
    }
    
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        Object invoke = method.invoke(target, objects);
        if(invoke != null) {
            return ((String)invoke).toUpperCase();
        }
        return invoke;
    }
}
