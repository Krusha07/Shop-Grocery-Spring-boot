package com.kishore.model;

public class SmsMessage {

    private String phone;

    private String content;

    public SmsMessage() {

    }

    public SmsMessage(String phone, String content) {
        this.phone = phone;
        this.content = content;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
