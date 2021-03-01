package com.jsh.erp.testcoupon;

import com.jsh.erp.testcoupon.Decorator.CouponDecorator;
import com.jsh.erp.testcoupon.Decorator.RedPacketDecorator;

import java.math.BigDecimal;
import java.util.Map;

/**
 * 优惠活动价格计算工具类
 */
public class PromotionFactory {
    public static BigDecimal getPayMoney(OrderDetail orderDetail) {
        Map<PromotionType, SupportPromotions> supportPromotionslist = orderDetail.getMerchandise().getSupportPromotions();

        IBaseCount baseCount = new BaseCount();

        if(supportPromotionslist != null) {
            for(PromotionType type : supportPromotionslist.keySet()) {
                baseCount = protmotion(supportPromotionslist.get(type), baseCount);
            }
        }

        return baseCount.countPayMoney(orderDetail);
    }

    private static IBaseCount protmotion(SupportPromotions supportPromotions, IBaseCount baseCount){
        if(supportPromotions.getPromotionType() == PromotionType.COUPON) {
            baseCount = new CouponDecorator(baseCount);
        }
        if(supportPromotions.getPromotionType() == PromotionType.COUPON) {
            baseCount = new RedPacketDecorator(baseCount);
        }

        return baseCount;
    }
}
