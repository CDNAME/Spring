package com.cd.test;

import com.cd.service.ISomeService;
import com.cd.service.SomeServiceImpl;
import com.cd.utils.SystemService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyTest {
    public static void main(String[] args) {
        SomeServiceImpl target = new SomeServiceImpl();
        ISomeService service = (ISomeService) Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    //织入weaving    
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        SystemService.doTx();
                        //执行目标方法
                        Object result = method.invoke(target, args);
                        SystemService.doLog();
                        return result;
                    }
                }
        );
        service.doFirst();
        System.out.println("===================");
        service.doSecond();
    }
}
