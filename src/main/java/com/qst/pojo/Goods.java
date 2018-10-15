package com.qst.pojo;

import java.util.Date;

public class Goods {
    private Integer goodsId;

    private String goodsDescribe;

    private Integer typeId;

    private Date goodsCreatetime;

    private Integer goodsPrice;

    private Integer goodsAmount;

    private String goodsCoverimg;

    private String goodsImg1;

    private String goodsImg2;

    private Integer userId;

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsDescribe() {
        return goodsDescribe;
    }

    public void setGoodsDescribe(String goodsDescribe) {
        this.goodsDescribe = goodsDescribe == null ? null : goodsDescribe.trim();
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Date getGoodsCreatetime() {
        return goodsCreatetime;
    }

    public void setGoodsCreatetime(Date goodsCreatetime) {
        this.goodsCreatetime = goodsCreatetime;
    }

    public Integer getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(Integer goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public Integer getGoodsAmount() {
        return goodsAmount;
    }

    public void setGoodsAmount(Integer goodsAmount) {
        this.goodsAmount = goodsAmount;
    }

    public String getGoodsCoverimg() {
        return goodsCoverimg;
    }

    public void setGoodsCoverimg(String goodsCoverimg) {
        this.goodsCoverimg = goodsCoverimg == null ? null : goodsCoverimg.trim();
    }

    public String getGoodsImg1() {
        return goodsImg1;
    }

    public void setGoodsImg1(String goodsImg1) {
        this.goodsImg1 = goodsImg1 == null ? null : goodsImg1.trim();
    }

    public String getGoodsImg2() {
        return goodsImg2;
    }

    public void setGoodsImg2(String goodsImg2) {
        this.goodsImg2 = goodsImg2 == null ? null : goodsImg2.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}