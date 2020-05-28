package com.example.service;

import com.example.design.strategy.CalculateStrategy;
import com.example.design.strategy.SuperVipStrategy;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class StrategyServiceTest {
    @Autowired
    StrategyService strategyService;

    @Test
   public void test() {
        List<CalculateStrategy> list = new ArrayList<>();
        list.add(new SuperVipStrategy());
        strategyService.addStrategy(list);
        double fee = strategyService.calculate("superVip", 10.0);
        System.out.println(fee);
    }

}
