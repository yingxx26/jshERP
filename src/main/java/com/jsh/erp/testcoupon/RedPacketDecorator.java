package com.jsh.erp.testcoupon;

import java.math.BigDecimal;

/**
 * 装饰器-优惠券实现类
 */
public class RedPacketDecorator extends BaseCountDecorator {

    public RedPacketDecorator(IBaseCount count) {
        super(count);
    }

    public BigDecimal countPayMoney(OrderDetail orderDetail){
        BigDecimal payTotalMoney = new BigDecimal(0);

        payTotalMoney = super.countPayMoney(orderDetail);
        payTotalMoney = countCouponPayMoney(orderDetail);

        return payTotalMoney;
    }

    private BigDecimal countCouponPayMoney(OrderDetail orderDetail) {
        BigDecimal redPacket = orderDetail.getMerchandise().getSupportPromotions().get(PromotionType.REDPACKET).getUserRedPacket().getRedPacket();
        System.out.println("红包优惠金额：" + redPacket);
        orderDetail.setPayMoney(orderDetail.getPayMoney().subtract(redPacket));

        return orderDetail.getPayMoney();
    }
}
