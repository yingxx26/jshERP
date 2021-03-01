package com.jsh.erp.testcoupon;

import com.jsh.erp.testcoupon.Coupon.UserCoupon;
import com.jsh.erp.testcoupon.Coupon.UserRedPacket;

/**
 * 商品支持的优惠活动，依次计算价格
 */
public class SupportPromotions implements Cloneable {
    private int id;
    private PromotionType promotionType;
    private int priority;
    private UserCoupon userCoupon;
    private UserRedPacket userRedPacket;

    public SupportPromotions clone(){
        SupportPromotions supportPromotions = null;
        try {
            supportPromotions = (SupportPromotions) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return supportPromotions;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public PromotionType getPromotionType() {
        return promotionType;
    }

    public void setPromotionType(PromotionType promotionType) {
        this.promotionType = promotionType;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public UserCoupon getUserCoupon() {
        return userCoupon;
    }

    public void setUserCoupon(UserCoupon userCoupon) {
        this.userCoupon = userCoupon;
    }

    public UserRedPacket getUserRedPacket() {
        return userRedPacket;
    }

    public void setUserRedPacket(UserRedPacket userRedPacket) {
        this.userRedPacket = userRedPacket;
    }
}
