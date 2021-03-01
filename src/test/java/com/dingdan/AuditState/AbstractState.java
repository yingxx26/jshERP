package com.dingdan.AuditState;

public abstract class AbstractState implements State {

    protected static final RuntimeException EXCEPTION = new RuntimeException("操作流程不允许");


    public String generateEvent(Context context) {
        throw EXCEPTION;
    }

    public String paySuccessedEvent(Context context) {
        throw EXCEPTION;
    }

    public String faHuoSuccessedEvent(Context context) {
        throw EXCEPTION;
    }

    public String qianShouSuccessedEvent(Context context) {
        throw EXCEPTION;
    }

    public String tuiKuangEvent(Context context) {
        throw EXCEPTION;
    }

    public String tuiKuangSuccessedEvent(Context context) {
        throw EXCEPTION;
    }

    public String rejectTuiKuangEvent(Context context) {
        throw EXCEPTION;
    }

    public String tuiHuoEvent(Context context) {
        throw EXCEPTION;
    }

    public String tuiHuoSuccessedEvent(Context context) {
        throw EXCEPTION;
    }

    public String rejectTuiHuoEvent(Context context) {
        throw EXCEPTION;
    }

    public String closeEvent(Context context) {
        throw EXCEPTION;
    }

}
