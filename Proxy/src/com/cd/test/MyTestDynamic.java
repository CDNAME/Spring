package com.cd.test;

import com.cd.service.ISomeService;
import com.cd.service.SomeServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyTestDynamic {
    public static void main(String[] args) {
        final ISomeService target = new SomeServiceImpl();
        //由Proxy类的newProxyInstance()方法生成一个动态代理对象
        ISomeService service = (ISomeService) Proxy.newProxyInstance(
                target.getClass().getClassLoader(),     //目标类的类加载器
                target.getClass().getInterfaces(),      //目标类锁实现的接口
                new InvocationHandler() {       //内部匿名类
                    //proxy:代理对象
                    //method:目标方法
                    //proxy:目标方法的参数列表
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        Object result = method.invoke(target, args);
                        if(result != null) {
                            return ((String)result).toUpperCase();
                        }
                        return result;
                    }
                }
        );
        
        String result = service.doFirst();
        System.out.println(result);
        service.doSecond();
    }
}
