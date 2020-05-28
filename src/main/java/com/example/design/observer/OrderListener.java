package com.example.design.observer;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class OrderListener implements ApplicationListener<OrderEvent> {

    @Override
    public void onApplicationEvent(OrderEvent orderEvent) {
//        监听订单，创建成功发送短信
        System.out.println("2,短信发送成功");
    }
    @EventListener
    public void processOrderEvent(OrderEvent orderEvent) {
        Object source = orderEvent.getSource();
        System.out.println(source);
        System.out.println("3,再次发送");
    }
}
