package com.yash.decorator.decorator;

import com.yash.decorator.component.Beverage;

public class WithMilkDecorator extends BeverageDecorator{
    public WithMilkDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String describe() {
        return super.describe() + "I contain milk.";
    }

    @Override
    public float cost() {
        return super.cost() + 0.5f;
    }
}
