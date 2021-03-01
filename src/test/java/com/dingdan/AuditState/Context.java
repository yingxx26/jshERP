package com.dingdan.AuditState;

import org.springframework.stereotype.Component;

//环境上下文
@Component
public class Context extends AbstractState {

    private State nextState;

    @Override
    public String generateEvent(Context context) {
        String currentState = nextState.generateEvent(this);
        return currentState;
    }

    @Override
    public String paySuccessedEvent(Context context) {
        String currentState = nextState.paySuccessedEvent(this);
        return currentState;
    }

    @Override
    public String faHuoSuccessedEvent(Context context) {
        String currentState = nextState.faHuoSuccessedEvent(this);
        return currentState;
    }

    @Override
    public String qianShouSuccessedEvent(Context context) {
        String currentState = nextState.qianShouSuccessedEvent(this);
        return currentState;
    }

    @Override
    public String tuiKuangEvent(Context context) {
        String currentState = nextState.tuiKuangEvent(this);
        return currentState;
    }

    @Override
    public String tuiKuangSuccessedEvent(Context context) {
        String currentState = nextState.tuiKuangSuccessedEvent(this);
        return currentState;
    }

    @Override
    public String rejectTuiKuangEvent(Context context) {
        String currentState = nextState.rejectTuiKuangEvent(this);
        return currentState;
    }

    @Override
    public String tuiHuoEvent(Context context) {
        String currentState = nextState.tuiHuoEvent(this);
        return currentState;
    }


    @Override
    public String tuiHuoSuccessedEvent(Context context) {
        String currentState = nextState.tuiHuoSuccessedEvent(this);
        return currentState;
    }

    @Override
    public String rejectTuiHuoEvent(Context context) {
        String currentState = nextState.rejectTuiHuoEvent(this);
        return currentState;
    }

    @Override
    public String closeEvent(Context context) {
        String currentState = nextState.closeEvent(this);
        return currentState;
    }


    public State getNextState() {
        return nextState;
    }

    public void setNextState(State nextState) {
        this.nextState = nextState;
    }

     
}
