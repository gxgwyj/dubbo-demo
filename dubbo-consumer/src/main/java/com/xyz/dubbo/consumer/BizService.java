package com.xyz.dubbo.consumer;

import com.xyz.dubbo.provider.model.UserVO;
import com.xyz.dubbo.provider.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BizService {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-consumer.xml");
        context.start();
        UserService userService = context.getBean(UserService.class); // 获取远程服务代理
        UserVO userVO = userService.queryUserVoById("10002");
        System.out.println(userVO.toString()); // 显示调用结果

    }
}
