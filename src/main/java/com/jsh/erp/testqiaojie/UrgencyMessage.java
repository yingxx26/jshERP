package com.jsh.erp.testqiaojie;

import org.springframework.stereotype.Component;

@Component("UrgencyMessage")
public class UrgencyMessage  extends    AbstractMessage{


    public void sendMessage(String message, String toUser) {
        message="加急："+message;
        super.getM().send(message, toUser);
    }
}
