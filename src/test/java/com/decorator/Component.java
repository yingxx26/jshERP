package com.decorator;

import java.util.Date;

public abstract class Component {
    public abstract  double calcPrise(String user, Date begin, Date end)  ;
}
