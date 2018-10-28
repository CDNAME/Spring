package com.cd.ba03;

public class ServiceFactory {
    public static ISomeService getSomeService() {
        return new SomeServiceImpl();
    }
}
