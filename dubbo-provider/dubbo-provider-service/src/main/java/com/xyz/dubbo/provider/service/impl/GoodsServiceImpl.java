package com.xyz.dubbo.provider.service.impl;

import com.xyz.dubbo.provider.model.GoodsVo;
import com.xyz.dubbo.provider.service.GoodsService;
import org.springframework.stereotype.Service;

/**
 * @author gaoxugang
 * @data 2019/8/27 0027 17:18
 * @description 商品服务实现
 */
@Service("goodsService")
public class GoodsServiceImpl implements GoodsService {
    @Override
    public GoodsVo queryGoods(String goodsId) {
        return new GoodsVo(goodsId, "商品" + goodsId);
    }
}
