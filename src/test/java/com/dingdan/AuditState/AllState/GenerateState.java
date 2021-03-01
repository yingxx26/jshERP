package com.dingdan.AuditState.AllState;


//各种具体状态类

import com.dingdan.AuditState.AbstractState;
import com.dingdan.AuditState.Context;
import com.dingdan.AuditState.StateEnum;

public class GenerateState extends AbstractState {

    @Override
    public String generateEvent(Context context) {
        context.setNextState(new WaitForPay());
        return StateEnum.WAIT_FOR_PAY.getKey();
    }


}

