package com.example.design.strategy;

public class VipStrategy implements CalculateStrategy {
    @Override
    public String userType() {
        return "vip";
    }

    @Override
    public double discount(double fee) {
        return fee * 0.8;
    }
}
