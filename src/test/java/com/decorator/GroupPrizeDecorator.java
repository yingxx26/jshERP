package com.decorator;

import java.util.Date;

public class GroupPrizeDecorator extends Decorator {
    public GroupPrizeDecorator(Component c) {
        super(c);
    }

    @Override
    public double calcPrise(String user, Date begin, Date end) {
        double money = super.calcPrise(user, begin, end);
        double group =0.0;
        for(double d: TempDB.mapMoney.values()){
            group+=d;
        }
        double prize=group*0.01;
        System.out.println(user+"当月团队业务奖金"+prize);
        return money+prize;
    }
}
