package com.jsh.erp.testqiaojie;

public abstract class AbstractMessage {


    private MessageImplementorInterface m;

    public void setM(MessageImplementorInterface m) {
        this.m = m;
    }

    public MessageImplementorInterface getM() {
        return m;
    }

    public abstract  void sendMessage(String message, String toUser) ;/*{
        impl.send(message, toUser);
     }*/
}
