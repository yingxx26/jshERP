package com.jsh.erp.testresponsibilitychain;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component("DepManager")
public class DepManager extends Handler{
    @Override
    public String handlerFeeRequset(String user, double fee) {
       String str=null;
       if(fee<1000){
           if("小李".equals(user)){
               str="部门经理同意"+user+"聚餐费用"+fee+"元的请求";
           }else {
               str="部门经理不同意"+user+"聚餐费用"+fee+"元的请求";
           }
           return str;
       } else {
           if(this.successor!=null){
               return successor.handlerFeeRequset(user,fee);
           }
       }
        return str;
    }
}
