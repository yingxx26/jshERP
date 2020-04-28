package com.jsh.erp.testqiaojie;

import org.springframework.stereotype.Component;

@Component("MessageSMS")
public class MessageSMS implements  MessageImplementorInterface {

    @Override
    public void send(String message, String toUser) {
        System.out.println("使用短信方式 发送消息:"+message+"--给:"+toUser);
    }
}
