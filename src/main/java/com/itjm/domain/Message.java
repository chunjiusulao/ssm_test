package com.itjm.domain;

/**
 * @author 靳明
 * @Description: 消息类
 * @date 2020/5/13  17:24
 */
public class Message {
    private String messageName;
    private String messageValue;
    public String getMessageName() {
        return messageName;
    }
    public void setMessageName(String messageName) {
        this.messageName = messageName;
    }
    public String getMessageValue() {
        return messageValue;
    }
    public void setMessageValue(String messageValue) {
        this.messageValue = messageValue;
    }
    /**
     * 设置消息
     * @param messageName
     * @param messageValue
     */
    public void setMessage(String messageName ,String messageValue) {
        this.messageName = messageName;
        this.messageValue = messageValue;
    }

    /**
     * 设置错误消息
     * messageName 默认为 "errorText"
     * @param messageValue
     */
    public void setErrorMessage(String messageValue) {
        this.messageName = "errorText";
        this.messageValue = messageValue;
    }

    /**
     * 设置成功消息
     * messageName 默认为 "successText"
     * @param messageValue
     */
    public void setSuccessMessage(String messageValue) {
        this.messageName = "successText";
        this.messageValue = messageValue;
    }

}
