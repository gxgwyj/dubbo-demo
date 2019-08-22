package com.xyz.dubbo.provider.service;

/**
 * @author gaoxugang
 * @data 2019/8/22 0022 21:16
 * @description 交易服务，会有不同的实现
 */
public interface TradeService {
    /**
     * 创建订单服务
     * @param amount
     * @return
     */
    public String createOrder(Integer amount);

}
