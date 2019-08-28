package com.xyz.dubbo.consumer;

import com.xyz.dubbo.provider.model.GoodsVo;
import com.xyz.dubbo.provider.service.GoodsService;
import org.springframework.context.ApplicationContext;

import java.io.IOException;

/**
 * @author gaoxugang
 * @data 2019/8/27 0027 17:53
 * @description TODO
 */
public class GoodsServiceConsumer {
    public static void main(String[] args) throws IOException {
        ApplicationContext context = MySpringContext.getAppContext();
        GoodsService goodsService = context.getBean(GoodsService.class); // 获取远程服务代理
        GoodsVo goodsVo = goodsService.queryGoods("11042");
        System.out.println(goodsVo.toString());
        System.in.read(); // 按任意键退出
    }
}
