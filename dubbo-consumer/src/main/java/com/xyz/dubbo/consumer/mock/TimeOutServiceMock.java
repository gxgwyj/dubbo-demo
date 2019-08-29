package com.xyz.dubbo.consumer.mock;

import com.xyz.dubbo.provider.service.TimeOutService;

/**
 * @author gaoxugang
 * @data 2019/8/29 0029 11:33
 * @description TODO
 */
public class TimeOutServiceMock implements TimeOutService {
    @Override
    public String getUserName(String userId) {
        return "异常";
    }
}
