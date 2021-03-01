package com.jsh.erp.testcoupon.Decorator;

import com.jsh.erp.testcoupon.Decorator.BaseCountDecorator;
import com.jsh.erp.testcoupon.IBaseCount;
import com.jsh.erp.testcoupon.OrderDetail;
import com.jsh.erp.testcoupon.PromotionType;

import java.math.BigDecimal;

/**
 * 装饰器-优惠券实现类
 */
public class CouponDecorator extends BaseCountDecorator {

    public CouponDecorator(IBaseCount count) {
        super(count);
    }

    public BigDecimal countPayMoney(OrderDetail orderDetail){
        BigDecimal payTotalMoney = new BigDecimal(0);

        payTotalMoney = super.countPayMoney(orderDetail);
        payTotalMoney = countCouponPayMoney(orderDetail);

        return payTotalMoney;
    }

    private BigDecimal countCouponPayMoney(OrderDetail orderDetail) {
        BigDecimal coupon = orderDetail.getMerchandise().getSupportPromotions().get(PromotionType.COUPON).getUserCoupon().getCoupon();
        System.out.println("优惠券金额：" + coupon);
        orderDetail.setPayMoney(orderDetail.getPayMoney().subtract(coupon));

        return orderDetail.getPayMoney();
    }
}
