package com.dingdan.AuditState.AllState;


//各种具体状态类

import com.dingdan.AuditState.AbstractState;
import com.dingdan.AuditState.Context;
import com.dingdan.AuditState.StateEnum;

public class YiFahuo extends AbstractState {

    @Override
    public String qianShouSuccessedEvent(Context context) {
        context.setNextState(new YiWancheng());
        return StateEnum.YI_WANGCHENG.getKey();
    }


}

