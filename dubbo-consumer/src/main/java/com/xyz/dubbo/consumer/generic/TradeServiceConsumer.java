package com.xyz.dubbo.consumer.generic;

import com.xyz.dubbo.provider.service.TradeService;
import org.springframework.context.ApplicationContext;

import java.io.IOException;

/**
 * @author gaoxugang
 * @data 2019/8/22 0022 21:30
 * @description TODO
 */
public class TradeServiceConsumer {
    public static void main(String[] args) throws IOException {
        ApplicationContext context = MySpringContext.getAppContext();
        TradeService aliTradeService = (TradeService)context.getBean("aliTradeService");
        TradeService wxTradeService = (TradeService)context.getBean("wxTradeService");
        System.out.println(aliTradeService.createOrder(1000));
        System.out.println(wxTradeService.createOrder(1000));
        System.in.read(); // 按任意键退出

    }
}
