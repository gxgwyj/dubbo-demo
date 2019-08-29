package com.xyz.dubbo.provider.service.impl;

import com.xyz.dubbo.provider.service.TimeOutService;
import org.springframework.stereotype.Service;

/**
 * @author gaoxugang
 * @data 2019/8/29 0029 11:06
 * @description TODO
 */
@Service("timeOutService")
public class TimeOutServiceImpl implements TimeOutService {
    @Override
    public String getUserName(String userId) {
        System.out.println("IN:" + userId);
        try {
            Thread.sleep(100000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "xiaoming";
    }
}
