package com.decorator;

import java.util.Date;

public abstract class Decorator extends Component {

    protected  Component c;

    public Decorator(Component c){
         this.c=c;
    }

    @Override
    public double calcPrise(String user, Date begin, Date end) {
        return c.calcPrise(user,begin,end);
    }
}
