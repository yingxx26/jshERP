package com.jsh.erp.testcoupon;

import java.math.BigDecimal;
import java.util.List;

/**
 * 订单实体类
 */
public class Order {
    private int id;
    private String orderNo;
    private BigDecimal totalPayMoney;
    private List<OrderDetail> list;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public BigDecimal getTotalPayMoney() {
        return totalPayMoney;
    }

    public void setTotalPayMoney(BigDecimal totalPayMoney) {
        this.totalPayMoney = totalPayMoney;
    }

    public List<OrderDetail> getList() {
        return list;
    }

    public void setList(List<OrderDetail> list) {
        this.list = list;
    }
}
