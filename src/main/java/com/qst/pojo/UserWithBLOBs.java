package com.qst.pojo;

public class UserWithBLOBs extends User {
    private byte[] userPhone;

    private byte[] businessRealname;

    public byte[] getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(byte[] userPhone) {
        this.userPhone = userPhone;
    }

    public byte[] getBusinessRealname() {
        return businessRealname;
    }

    public void setBusinessRealname(byte[] businessRealname) {
        this.businessRealname = businessRealname;
    }
}