package com.xyz.dubbo.consumer;

import com.xyz.dubbo.provider.service.TimeOutService;
import org.springframework.context.ApplicationContext;

import java.io.IOException;

/**
 * @author gaoxugang
 * @data 2019/8/29 0029 11:11
 * @description TODO
 */
public class TimeOutServiceConsumer {
    public static void main(String[] args) throws IOException {
        ApplicationContext context = MySpringContext.getAppContext();
        TimeOutService timeOutService = context.getBean(TimeOutService.class);
        timeOutService.getUserName("120045");
        System.in.read(); // 按任意键退出
    }
}
