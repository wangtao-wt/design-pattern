package com.example.design.strategy;

public class SuperVipStrategy implements CalculateStrategy {
    @Override
    public String userType() {
        return "superVip";
    }

    @Override
    public double discount(double fee) {
        return fee * 0.5;
    }
}
