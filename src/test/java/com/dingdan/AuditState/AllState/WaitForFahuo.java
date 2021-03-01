package com.dingdan.AuditState.AllState;


import com.dingdan.AuditState.AbstractState;
import com.dingdan.AuditState.Context;
import com.dingdan.AuditState.StateEnum;

public class WaitForFahuo extends AbstractState {

    @Override
    public String faHuoSuccessedEvent(Context context) {
        context.setNextState(new YiFahuo());
        return StateEnum.YI_FAHUO.getKey();
    }

    @Override
    public String tuiKuangEvent(Context context) {
        context.setNextState(new TuiKuangState());
        return StateEnum.TUIKUANG.getKey();
    }


 }
