package com.xyz.dubbo.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppRun {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-provider.xml");
        context.start();
        System.out.println("spring context started");
        System.in.read(); // 按任意键退出
    }
}
