package com.example.service;

import com.example.design.strategy.CalculateStrategy;
import com.example.design.strategy.NormalStrategy;
import com.example.design.strategy.VVipStrategy;
import com.example.design.strategy.VipStrategy;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class StrategyService {

    Map<String, CalculateStrategy> map = new HashMap<>();

    public StrategyService() {
        map.put("normal", new NormalStrategy());
        map.put("vip", new VipStrategy());
        map.put("vvip", new VVipStrategy());
    }

    public void addStrategy(List<CalculateStrategy> list) {
        for (CalculateStrategy strategy : list) {
            map.put(strategy.userType(), strategy);
        }
    }

   public double calculate(String userType, double fee) {
       CalculateStrategy strategy = map.get(userType);
       if (strategy != null) {
           return strategy.discount(fee);
       }
       return fee;
   }
}
