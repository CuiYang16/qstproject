package com.qst.pojo;

public class OrdersWithBLOBs extends Orders {
    private byte[] orderConsignee;

    private byte[] orderAdsress;

    private byte[] orderPhone;

    public byte[] getOrderConsignee() {
        return orderConsignee;
    }

    public void setOrderConsignee(byte[] orderConsignee) {
        this.orderConsignee = orderConsignee;
    }

    public byte[] getOrderAdsress() {
        return orderAdsress;
    }

    public void setOrderAdsress(byte[] orderAdsress) {
        this.orderAdsress = orderAdsress;
    }

    public byte[] getOrderPhone() {
        return orderPhone;
    }

    public void setOrderPhone(byte[] orderPhone) {
        this.orderPhone = orderPhone;
    }
}