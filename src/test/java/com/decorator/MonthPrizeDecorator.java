package com.decorator;

import java.util.Date;

public class MonthPrizeDecorator extends Decorator {
    public MonthPrizeDecorator(Component c) {
        super(c);
    }

    @Override
    public double calcPrise(String user, Date begin, Date end) {
        double money = super.calcPrise(user, begin, end);
        double prize =TempDB.mapMoney.get(user)*0.03;
        System.out.println(user+"当月业务奖金"+prize);
        return money+prize;
    }
}
