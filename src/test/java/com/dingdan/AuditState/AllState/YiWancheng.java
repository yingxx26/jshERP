package com.dingdan.AuditState.AllState;


//各种具体状态类

import com.dingdan.AuditState.AbstractState;
import com.dingdan.AuditState.Context;
import com.dingdan.AuditState.StateEnum;

public class YiWancheng extends AbstractState {

    @Override
    public String tuiHuoEvent(Context context) {
        context.setNextState(new TuiHuoState());
        return StateEnum.TUIHUO.getKey();
    }


}

