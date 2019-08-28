package com.xyz.dubbo.consumer;

import com.xyz.dubbo.provider.model.UserVO;
import com.xyz.dubbo.provider.service.UserService;
import org.apache.dubbo.rpc.RpcContext;
import org.springframework.context.ApplicationContext;

public class BizService {

    public static void main(String[] args) throws Exception {
        ApplicationContext context = MySpringContext.getAppContext();
        UserService userService = context.getBean(UserService.class); // 获取远程服务代理
        // 隐式传参，必须在调用之前设置
        RpcContext.getContext().setAttachment("index","abc");
        UserVO userVO = userService.queryUserVoById("10002");
        // 获取最后一次调用的提供方IP地址
        String serverIP = RpcContext.getContext().getRemoteHost();
        System.out.println(serverIP);
        // 获取当前服务配置信息，所有配置信息都将转换为URL的参数
        System.out.println(userVO.toString()); // 显示调用结果
        System.in.read(); // 按任意键退出

    }
}
