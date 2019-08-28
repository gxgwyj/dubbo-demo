package com.xyz.dubbo.provider.model;

import java.io.Serializable;

/**
 * @author gaoxugang
 * @data 2019/8/27 0027 17:16
 * @description TODO
 */
public class GoodsVo implements Serializable {
    private static final long serialVersionUID = 4504841560286234087L;

    private String goodsId;

    private String goodsName;

    public GoodsVo(String goodsId, String goodsName) {
        this.goodsId = goodsId;
        this.goodsName = goodsName;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    @Override
    public String toString() {
        return "GoodsVo{" +
                "goodsId='" + goodsId + '\'' +
                ", goodsName='" + goodsName + '\'' +
                '}';
    }
}
