package com.jsh.erp.testqiaojie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("CommonMessage")
public class CommonMessage extends    AbstractMessage {



    public void sendMessage(String message, String toUser) {
        super.getM().send(message, toUser);
    }
}
