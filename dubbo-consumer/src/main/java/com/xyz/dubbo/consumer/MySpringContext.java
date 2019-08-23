package com.xyz.dubbo.consumer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpringContext {
    /**
     * 使用volatile关键字保证多线程对内存变量的可见性
     */
    private volatile static ApplicationContext ctx;

    /**
     * 构造方法私有化
     */
    private MySpringContext(){}

    /**
     * 获取单例的静态方法
     * @return
     */
    public static ApplicationContext getAppContext(){
        if (ctx == null) {
            synchronized (ApplicationContext.class) {
                if (ctx == null) {
                    ctx = new ClassPathXmlApplicationContext("applicationContext-consumer.xml");
                }
            }
        }
        return ctx;
    }
}
