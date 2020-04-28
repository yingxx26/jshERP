package com.jsh.erp.testdecorator;

import org.springframework.stereotype.Component;

import java.util.Date;


public abstract class MyComponent {
    public abstract  double calcPrise(String user, Date begin, Date end)  ;
}
