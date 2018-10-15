package com.qst.pojo;

public class AuctionStatus {
    private Integer asId;

    private Integer userId;

    private Integer orderId;

    private String asStatus;

    public Integer getAsId() {
        return asId;
    }

    public void setAsId(Integer asId) {
        this.asId = asId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getAsStatus() {
        return asStatus;
    }

    public void setAsStatus(String asStatus) {
        this.asStatus = asStatus == null ? null : asStatus.trim();
    }
}