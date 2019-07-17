package com.xyz.dubbo.provider.service.impl;

import com.xyz.dubbo.provider.model.UserVO;
import com.xyz.dubbo.provider.service.UserService;
import org.apache.dubbo.rpc.RpcContext;
import org.springframework.stereotype.Service;

@Service(value = "userService")
public class UserServiceImpl implements UserService {
    @Override
    public UserVO queryUserVoById(String id) {
        // 获取客户端隐式传入的参数，用于框架集成，不建议常规业务使用
        String index = RpcContext.getContext().getAttachment("index");
        System.out.println("服务端获取的隐式传参：" + index);
        UserVO userVO = new UserVO();
        userVO.setUserName("高旭刚");
        userVO.setPhoneNumber("15135158097");
        userVO.setEmail("498868779@qq.com");
        return userVO;
    }
}
