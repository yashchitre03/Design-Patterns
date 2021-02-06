package com.yash.factory_method.plan;

public class DomesticPlan implements Plan{
    @Override
    public double calculate(int units) {
        return rate * units;
    }
}
