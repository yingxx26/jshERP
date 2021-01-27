package com.jsh.erp.testcoupon;

import java.math.BigDecimal;

/**
 * 基本实现类
 */
public class BaseCount implements IBaseCount {
    @Override
    public BigDecimal countPayMoney(OrderDetail orderDetail) {
        orderDetail.setPayMoney(orderDetail.getMerchandise().getPrice());
        System.out.println("商品原单价金额为：" + orderDetail.getPayMoney());

        return orderDetail.getPayMoney();
    }
}
