package com.xyz.dubbo.consumer.mock;

import com.xyz.dubbo.provider.model.UserVO;
import com.xyz.dubbo.provider.service.UserService;

/**
 * @author gaoxugang
 * @data 2019/8/27 0027 18:33
 * @description 本地伪装，用于实现服务降级
 */
public class UserServiceMock implements UserService {
    @Override
    public UserVO queryUserVoById(String id) {
        System.out.println("服务端不可用，返回伪造数据");
        UserVO userVO = new UserVO();
        userVO.setUserName("error user");
        return userVO;
    }
}
