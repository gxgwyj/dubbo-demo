package com.xyz.dubbo.provider.service.impl;

import com.xyz.dubbo.provider.service.TradeService;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * @author gaoxugang
 * @data 2019/8/22 0022 21:18
 * @description TODO
 */
@Service("wxTradeService")
public class WxTradeServiceImpl implements TradeService {
    @Override
    public String createOrder(Integer amount) {
        return "wx-trade" + UUID.randomUUID();
    }
}
