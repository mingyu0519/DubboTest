package com.dubbo.provider;

/**
 * Created by wangmy on 16/6/5.
 */
public class DemoServiceImpl implements DemoService{
    @Override
    public String sayHello(String name) {
        return "Hello Dubbo, Hello " + name;
    }
}
