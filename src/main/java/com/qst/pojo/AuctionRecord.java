package com.qst.pojo;

import java.util.Date;

public class AuctionRecord {
    private Integer arId;

    private Integer userId;

    private Integer goodsId;

    private Date arTime;

    private Integer arPrice;

    public Integer getArId() {
        return arId;
    }

    public void setArId(Integer arId) {
        this.arId = arId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Date getArTime() {
        return arTime;
    }

    public void setArTime(Date arTime) {
        this.arTime = arTime;
    }

    public Integer getArPrice() {
        return arPrice;
    }

    public void setArPrice(Integer arPrice) {
        this.arPrice = arPrice;
    }
}