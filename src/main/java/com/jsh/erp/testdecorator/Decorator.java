package com.jsh.erp.testdecorator;

import java.util.Date;

public abstract class Decorator extends MyComponent {

    protected MyComponent c;

    public Decorator(MyComponent c){
         this.c=c;
    }

    @Override
    public double calcPrise(String user, Date begin, Date end) {
        return c.calcPrise(user,begin,end);
    }
}
