package com.jsh.erp;

import com.jsh.erp.testdecorator.*;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class DecoratorTest {

    @Test
    public void testDecorator() throws Exception{
      //任意组合 装饰器模式
        MyComponent c1=new ConcreteComponent();
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
