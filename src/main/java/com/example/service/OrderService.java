package com.example.service;

 import com.example.design.observer.OrderEvent;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    ApplicationContext applicationContext;
    public void saveOrder() {
        System.out.println("1,订单创建成功");

        OrderEvent orderEvent = new OrderEvent("参数");
        this.applicationContext.publishEvent(orderEvent);
    }
}
