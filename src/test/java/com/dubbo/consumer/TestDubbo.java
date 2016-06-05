package com.dubbo.consumer;

import com.dubbo.provider.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by wangmy on 16/6/5.
 */
public class TestDubbo {
    @Test
    public void TestA(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:dubbo-consumer.xml");
        context.start();
        DemoService demoService = (DemoService)context.getBean("demoService"); // 获取远程服务代理
        String hello = demoService.sayHello("world"); // 执行远程方法
        System.out.println(hello);
        Assert.assertTrue(hello.contains("Hello"));
    }
}
