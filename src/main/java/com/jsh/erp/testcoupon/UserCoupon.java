package com.jsh.erp.testcoupon;

import java.math.BigDecimal;

/**
 * 用户优惠券类
 */
public class UserCoupon {
    private int id;
    private int userId;
    private String sku;
    private BigDecimal coupon;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public BigDecimal getCoupon() {
        return coupon;
    }

    public void setCoupon(BigDecimal coupon) {
        this.coupon = coupon;
    }
}
