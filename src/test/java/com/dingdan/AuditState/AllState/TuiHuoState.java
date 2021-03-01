package com.dingdan.AuditState.AllState;


import com.dingdan.AuditState.AbstractState;
import com.dingdan.AuditState.Context;
import com.dingdan.AuditState.StateEnum;

public class TuiHuoState extends AbstractState {


    @Override
    public String rejectTuiHuoEvent(Context context) {
        context.setNextState(new YiWancheng());
        return StateEnum.YI_WANGCHENG.getKey();
    }

    @Override
    public String tuiHuoSuccessedEvent(Context context) {
        context.setNextState(new CloseState());
        return StateEnum.CLOSE.getKey();
    }


}
