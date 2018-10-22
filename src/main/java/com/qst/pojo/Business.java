package com.qst.pojo;

import java.util.Date;

public class Business {
    private Integer businessId;

    private String businessName;

    private String businessPwd;

    private Date businessTime;

    private String businessImg;

    private String businessRealname;

    private String businessIdentity;

    private String businessType;

    private Integer userId;

    private Integer authorityId;

    private byte[] businessAddress;

    public Integer getBusinessId() {
        return businessId;
    }

    public void setBusinessId(Integer businessId) {
        this.businessId = businessId;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName == null ? null : businessName.trim();
    }

    public String getBusinessPwd() {
        return businessPwd;
    }

    public void setBusinessPwd(String businessPwd) {
        this.businessPwd = businessPwd == null ? null : businessPwd.trim();
    }

    public Date getBusinessTime() {
        return businessTime;
    }

    public void setBusinessTime(Date businessTime) {
        this.businessTime = businessTime;
    }

    public String getBusinessImg() {
        return businessImg;
    }

    public void setBusinessImg(String businessImg) {
        this.businessImg = businessImg == null ? null : businessImg.trim();
    }

    public String getBusinessRealname() {
        return businessRealname;
    }

    public void setBusinessRealname(String businessRealname) {
        this.businessRealname = businessRealname == null ? null : businessRealname.trim();
    }

    public String getBusinessIdentity() {
        return businessIdentity;
    }

    public void setBusinessIdentity(String businessIdentity) {
        this.businessIdentity = businessIdentity == null ? null : businessIdentity.trim();
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType == null ? null : businessType.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getAuthorityId() {
        return authorityId;
    }

    public void setAuthorityId(Integer authorityId) {
        this.authorityId = authorityId;
    }

    public byte[] getBusinessAddress() {
        return businessAddress;
    }

    public void setBusinessAddress(byte[] businessAddress) {
        this.businessAddress = businessAddress;
    }
}