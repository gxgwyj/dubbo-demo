package com.xyz.dubbo.provider.service;

/**
 * @author gaoxugang
 * @data 2019/8/23 0023 22:22
 * @description dubbo 可以实现服务端对客户端的反向调用
 */
public interface CallbackService {
    public void addListener(String key, CallbackListener listener);
}
