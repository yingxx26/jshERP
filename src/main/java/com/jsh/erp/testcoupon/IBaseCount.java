package com.jsh.erp.testcoupon;

import java.math.BigDecimal;

/**
 * 基本接口类
 */
public interface IBaseCount {
    /**
     * 计算订单商品支付金额
     */
    BigDecimal countPayMoney(OrderDetail orderDetail);
}
