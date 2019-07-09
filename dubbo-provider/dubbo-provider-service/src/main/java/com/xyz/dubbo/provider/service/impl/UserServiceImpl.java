package com.xyz.dubbo.provider.service.impl;

import com.xyz.dubbo.provider.model.UserVO;
import com.xyz.dubbo.provider.service.UserService;
import org.springframework.stereotype.Service;

@Service(value = "userService")
public class UserServiceImpl implements UserService {
    @Override
    public UserVO queryUserVoById(String id) {
        UserVO userVO = new UserVO();
        userVO.setUserName("高旭刚");
        userVO.setPhoneNumber("15135158097");
        userVO.setEmail("498868779@qq.com");
        return null;
    }
}
