package com.xyz.dubbo.provider.service;

import com.xyz.dubbo.provider.model.GoodsVo;

/**
 * @author gaoxugang
 * @data 2019/8/27 0027 17:15
 * @description 商品服务接口
 */
public interface GoodsService {

    /**
     * 查询商品Id
     * @param goodsId
     * @return
     */
    public GoodsVo queryGoods(String goodsId);

}
