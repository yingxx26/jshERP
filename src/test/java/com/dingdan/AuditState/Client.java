package com.dingdan.AuditState;

import com.dingdan.AuditState.AllState.GenerateState;
import com.dingdan.AuditState.AllState.TuiHuoState;
import com.dingdan.AuditState.AllState.TuiKuangState;
import com.dingdan.AuditState.AllState.WaitForFahuo;

/**
 * 测试类
 */
public class Client {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Context context = new Context();//Context应该就是个业务对象
        context.setNextState(new TuiHuoState());
        //然后可以根据操作变化状态.


        String s1 = context.tuiHuoSuccessedEvent(context);
        System.out.println(s1);

    }

}
