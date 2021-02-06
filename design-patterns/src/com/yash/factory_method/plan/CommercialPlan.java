package com.yash.factory_method.plan;

public class CommercialPlan implements Plan{
    @Override
    public double calculate(int units) {
        return 1.5 * rate * units;
    }
}
