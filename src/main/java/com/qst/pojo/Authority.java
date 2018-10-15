package com.qst.pojo;

public class Authority {
    private Integer authorityId;

    private String authorityManageGoods;

    private String authorityManageUser;

    private String authorityManageOrder;

    private String authorityBusiness;

    private String authorityAuthorization;

    private String authoritySuper;

    public Integer getAuthorityId() {
        return authorityId;
    }

    public void setAuthorityId(Integer authorityId) {
        this.authorityId = authorityId;
    }

    public String getAuthorityManageGoods() {
        return authorityManageGoods;
    }

    public void setAuthorityManageGoods(String authorityManageGoods) {
        this.authorityManageGoods = authorityManageGoods == null ? null : authorityManageGoods.trim();
    }

    public String getAuthorityManageUser() {
        return authorityManageUser;
    }

    public void setAuthorityManageUser(String authorityManageUser) {
        this.authorityManageUser = authorityManageUser == null ? null : authorityManageUser.trim();
    }

    public String getAuthorityManageOrder() {
        return authorityManageOrder;
    }

    public void setAuthorityManageOrder(String authorityManageOrder) {
        this.authorityManageOrder = authorityManageOrder == null ? null : authorityManageOrder.trim();
    }

    public String getAuthorityBusiness() {
        return authorityBusiness;
    }

    public void setAuthorityBusiness(String authorityBusiness) {
        this.authorityBusiness = authorityBusiness == null ? null : authorityBusiness.trim();
    }

    public String getAuthorityAuthorization() {
        return authorityAuthorization;
    }

    public void setAuthorityAuthorization(String authorityAuthorization) {
        this.authorityAuthorization = authorityAuthorization == null ? null : authorityAuthorization.trim();
    }

    public String getAuthoritySuper() {
        return authoritySuper;
    }

    public void setAuthoritySuper(String authoritySuper) {
        this.authoritySuper = authoritySuper == null ? null : authoritySuper.trim();
    }
}