package com.qst.pojo;

public class MessageWithBLOBs extends Message {
    private String messageDetails;

    private String messageReply;

    public String getMessageDetails() {
        return messageDetails;
    }

    public void setMessageDetails(String messageDetails) {
        this.messageDetails = messageDetails == null ? null : messageDetails.trim();
    }

    public String getMessageReply() {
        return messageReply;
    }

    public void setMessageReply(String messageReply) {
        this.messageReply = messageReply == null ? null : messageReply.trim();
    }
}