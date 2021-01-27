package com.jsh.erp.testcoupon;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Order order = new Order();
        init(order);
        for (OrderDetail orderDetail : order.getList()) {
            BigDecimal payMoney = PromotionFactory.getPayMoney(orderDetail);
            orderDetail.setPayMoney(payMoney);
            System.out.println("最终支付金额：" + orderDetail.getPayMoney());
        }
    }

    /**
     * 初始化订单
     */
    private static Order init(Order order) {
        Map<PromotionType, SupportPromotions> supportPromotionslist = new HashMap<PromotionType, SupportPromotions>();

        SupportPromotions supportPromotions = new SupportPromotions();
        supportPromotions.setPromotionType(PromotionType.COUPON);
        supportPromotions.setPriority(1);

        ///用户优惠券类
        UserCoupon userCoupon = new UserCoupon();
        userCoupon.setCoupon(new BigDecimal(3));
        userCoupon.setSku("aaa1111");
        userCoupon.setUserId(11);

        supportPromotions.setUserCoupon(userCoupon);

        supportPromotionslist.put(PromotionType.COUPON, supportPromotions);
        SupportPromotions supportPromotions1 = supportPromotions.clone();

        supportPromotions1.setPromotionType(PromotionType.REDPACKET);
        supportPromotions1.setPriority(2);
        //用户红包
        UserRedPacket userRedPacket = new UserRedPacket();
        userRedPacket.setId(1);
        userRedPacket.setRedPacket(new BigDecimal(10));
        userRedPacket.setSku("aaa1111");
        userCoupon.setUserId(11);

        supportPromotions1.setUserRedPacket(userRedPacket);
        supportPromotionslist.put(PromotionType.REDPACKET, supportPromotions1);


        //商品实体类
        Merchandise merchandise = new Merchandise();
        merchandise.setSku("aaa1111");
        merchandise.setName("苹果");
        merchandise.setPrice(new BigDecimal(20));
        merchandise.setSupportPromotions(supportPromotionslist);

        List<OrderDetail> OrderDetailList = new ArrayList<OrderDetail>();

        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setId(1);
        orderDetail.setOrderId(1111);
        orderDetail.setMerchandise(merchandise);

        OrderDetailList.add(orderDetail);

        order.setList(OrderDetailList);

        return order;

    }
}
