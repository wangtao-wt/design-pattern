package com.example.design.strategy;

public class VVipStrategy implements CalculateStrategy {
    @Override
    public String userType() {
        return "vvip";
    }

    @Override
    public double discount(double fee) {
        return fee * 0.7;
    }
}
