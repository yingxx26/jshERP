package com.decorator;

public class Client
{
    public static void main(String[] args) {

//任意组合 装饰器模式
        Component c1=new ConcreteComponent();
        Decorator d1= new MonthPrizeDecorator(c1);
       // Decorator d2=new SumPrizeDecorator(d1);
        Decorator d3=new GroupPrizeDecorator(d1);

        double prise1 = d3.calcPrise("张三", null, null);
        System.out.println("张三"+prise1);

        double prise2 = d3.calcPrise("李四", null, null);
        System.out.println("李四"+prise2);

        double prise3 = d1.calcPrise("王五", null, null);
        System.out.println("王五"+prise3);
    }

}
