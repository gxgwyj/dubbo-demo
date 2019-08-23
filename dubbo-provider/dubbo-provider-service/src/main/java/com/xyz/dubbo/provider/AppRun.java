package com.xyz.dubbo.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppRun {
    public static void main(String[] args) throws Exception {
        // 同事启动两个容器
        ClassPathXmlApplicationContext context1 = new ClassPathXmlApplicationContext("applicationContext-provider.xml");
        context1.start();
        System.out.println("spring context1 started");
//        ClassPathXmlApplicationContext context2 = new ClassPathXmlApplicationContext("applicationContext-provider-1.xml");
//        context2.start();
//        System.out.println("spring context2 started");
        System.in.read(); // 按任意键退出
    }
}
