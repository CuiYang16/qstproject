package com.qst.pojo;

public class GoodsWithBLOBs extends Goods {
    private byte[] goodsName;

    private byte[] goodsImg3;

    public byte[] getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(byte[] goodsName) {
        this.goodsName = goodsName;
    }

    public byte[] getGoodsImg3() {
        return goodsImg3;
    }

    public void setGoodsImg3(byte[] goodsImg3) {
        this.goodsImg3 = goodsImg3;
    }
}