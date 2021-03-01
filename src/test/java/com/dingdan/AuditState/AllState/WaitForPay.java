package com.dingdan.AuditState.AllState;

import com.dingdan.AuditState.AbstractState;
import com.dingdan.AuditState.Context;
import com.dingdan.AuditState.StateEnum;

public class WaitForPay extends AbstractState {
    @Override
    public String paySuccessedEvent(Context context) {
        context.setNextState(new WaitForFahuo());
        return StateEnum.WAIT_FOR_FAHUO.getKey();
    }

    @Override
    public String closeEvent(Context context) {
        context.setNextState(new CloseState());
        return StateEnum.CLOSE.getKey();
    }


}
