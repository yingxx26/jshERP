package com.jsh.erp.testresponsibilitychain;

public abstract class Handler {

    protected Handler successor=null;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract String handlerFeeRequset ( String user,double fee);
}
