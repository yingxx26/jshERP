package com.jsh.erp.testqiaojie;

import org.springframework.stereotype.Component;

@Component("MessageEmail")
public class MessageEmail implements  MessageImplementorInterface {

    @Override
    public void send(String message, String toUser) {
        System.out.println("使用Email方式 发送消息:"+message+"--给:"+toUser);
    }
}
