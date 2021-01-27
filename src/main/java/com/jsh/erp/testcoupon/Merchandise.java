package com.jsh.erp.testcoupon;

import java.math.BigDecimal;
import java.util.Map;

/**
 * 商品实体类
 */
public class Merchandise {
    private String sku;
    private String name;
    private BigDecimal price;
    private Map<PromotionType, SupportPromotions> supportPromotions;

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Map<PromotionType, SupportPromotions> getSupportPromotions() {
        return supportPromotions;
    }

    public void setSupportPromotions(Map<PromotionType, SupportPromotions> supportPromotions) {
        this.supportPromotions = supportPromotions;
    }
}
