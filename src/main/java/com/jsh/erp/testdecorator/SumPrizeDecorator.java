package com.jsh.erp.testdecorator;

import org.springframework.stereotype.Component;

import java.util.Date;

public class SumPrizeDecorator extends Decorator {
    public SumPrizeDecorator(MyComponent c) {
        super(c);
    }

    @Override
    public double calcPrise(String user, Date begin, Date end) {
        double money = super.calcPrise(user, begin, end);
        double prize =1000000*0.01;
        System.out.println(user+"累计奖金"+prize);
        return money+prize;
    }
}
