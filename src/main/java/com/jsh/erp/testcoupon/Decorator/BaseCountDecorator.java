package com.jsh.erp.testcoupon.Decorator;

import com.jsh.erp.testcoupon.IBaseCount;
import com.jsh.erp.testcoupon.OrderDetail;

import java.math.BigDecimal;

/**
 * 装饰器-基本抽象类
 */
public abstract class BaseCountDecorator implements IBaseCount {
    private IBaseCount count;

    public BaseCountDecorator(IBaseCount count) {
        this.count = count;
    }

    public BigDecimal countPayMoney(OrderDetail orderDetail) {
        BigDecimal payTotalMoney = new BigDecimal(0);
        if(count != null) {
            payTotalMoney = count.countPayMoney(orderDetail);
        }

        return payTotalMoney;
    }
}
