package com.cd.ba02;

public class ServiceFactory {
    public ISomeService getSomeService() {
        return new SomeServiceImpl();
    }
}
