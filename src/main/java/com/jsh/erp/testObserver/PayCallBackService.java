package com.jsh.erp.testObserver;

import com.jsh.erp.datasource.entities.User;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
@Service
public class PayCallBackService  {

    @Autowired
    private ApplicationContext applicationContext;


    public void callback( ){
        if(true){
            //构造支付成功事件
            UserRegisterEvent e=new UserRegisterEvent(this,new User());
            //通过applicationContext发布事件，从而达到通知观察者的目的
            System.out.println("发布事件");
            this.applicationContext.publishEvent(e);

        }
    }

}
