package com.xyz.dubbo.consumer;

import com.xyz.dubbo.provider.model.UserVO;
import com.xyz.dubbo.provider.service.UserService;
import org.apache.dubbo.rpc.RpcContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BizService {

    public static void main(String[] args) {
        ApplicationContext context = MySpringContext.getAppContext();
        UserService userService = context.getBean(UserService.class); // 获取远程服务代理
        // 隐式传参，必须在调用之前设置
        RpcContext.getContext().setAttachment("index","abc");
        UserVO userVO = userService.queryUserVoById("10002");
        System.out.println(userVO.toString()); // 显示调用结果

    }
}
