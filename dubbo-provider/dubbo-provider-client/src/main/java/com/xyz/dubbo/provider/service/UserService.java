package com.xyz.dubbo.provider.service;

import com.xyz.dubbo.provider.model.UserVO;

public interface UserService {
    public UserVO queryUserVoById(String id);
}
