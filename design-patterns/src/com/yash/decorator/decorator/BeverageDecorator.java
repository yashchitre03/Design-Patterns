package com.yash.decorator.decorator;

import com.yash.decorator.component.Beverage;

public abstract class BeverageDecorator implements Beverage {
    private final Beverage beverage;

    public BeverageDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String describe() {
        return beverage.describe();
    }

    @Override
    public float cost() {
        return beverage.cost();
    }
}
