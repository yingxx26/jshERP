package com.jsh.erp.testObserver;

import com.jsh.erp.datasource.entities.User;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @author jackcooper
 * @create 2018-02-27 14:17
 * @deprecated 方法一：注解方式比较简单，并不需要实现任何接口   排序随机
 */
@Component
public class AnnotationRegisterListener {
    /**
     * 注册监听实现方法
     * @param userRegisterEvent 用户注册事件
     */
    @EventListener
    public void sendEmail(UserRegisterEvent userRegisterEvent)
    {
        //获取注册用户对象
        User user = userRegisterEvent.getUser();

        //todo

        //输出注册用户信息
        System.out.println("发送邮件，用户名： ，邮箱："+user.getEmail());
    }

    /**
     * 注册监听实现方法
     * @param userRegisterEvent 用户注册事件
     */
    @EventListener
    public void register(UserRegisterEvent userRegisterEvent)
    {
        //获取注册用户对象
        User user = userRegisterEvent.getUser();

        //todo

        //输出注册用户信息
        System.out.println("1注册信息，用户名： ，邮箱："+user.getEmail());
    }

}