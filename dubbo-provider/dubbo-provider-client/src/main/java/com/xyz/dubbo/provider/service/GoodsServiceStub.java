package com.xyz.dubbo.provider.service;

import com.xyz.dubbo.provider.model.GoodsVo;

/**
 * @author gaoxugang
 * @data 2019/8/27 0027 17:45
 * @description 注意存根类必须放到client中
 */
public class GoodsServiceStub implements GoodsService {

    private GoodsService goodsService;

    /**
     * 必须有目标类的实例构造方法
     * @param goodsService
     */
    public GoodsServiceStub(GoodsService goodsService) {
        this.goodsService = goodsService;
    }

    @Override
    public GoodsVo queryGoods(String goodsId) {
        try {
            System.out.println("客户端调用之前");
            return goodsService.queryGoods(goodsId);
        } catch (Exception e) {
            // 你可以容错，可以做任何AOP拦截事项
            e.printStackTrace();
        }
        return null;
    }
}
