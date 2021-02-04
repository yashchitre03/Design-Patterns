package com.yash.decorator.decorator;

import com.yash.decorator.component.Beverage;

public class WithSugarDecorator extends BeverageDecorator{
    public WithSugarDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String describe() {
        return super.describe() + "I contain sugar.";
    }

    @Override
    public float cost() {
        return super.cost() + 0.2f;
    }
}
