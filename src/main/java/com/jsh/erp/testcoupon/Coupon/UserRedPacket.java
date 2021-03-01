package com.jsh.erp.testcoupon.Coupon;

import java.math.BigDecimal;

/**
 * 用户红包类
 */
public class UserRedPacket {
    private int id;
    private int userId;
    private String sku;
    private BigDecimal redPacket;

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

    public BigDecimal getRedPacket() {
        return redPacket;
    }

    public void setRedPacket(BigDecimal redPacket) {
        this.redPacket = redPacket;
    }
}
