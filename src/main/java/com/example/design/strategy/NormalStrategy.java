package com.example.design.strategy;

public class NormalStrategy implements CalculateStrategy {
    @Override
    public String userType() {
        return "normal";
    }

    @Override
    public double discount(double fee) {
        return fee * 0.95;
    }
}
