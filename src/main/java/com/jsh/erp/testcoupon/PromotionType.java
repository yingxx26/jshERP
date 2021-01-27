package com.jsh.erp.testcoupon;

/**
 * 优惠活动枚举
 */
public enum PromotionType {
    COUPON(1),
    REDPACKET(2),
    ;
    private int code;

    PromotionType(final int code){
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
