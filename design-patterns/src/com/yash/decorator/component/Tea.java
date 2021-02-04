package com.yash.decorator.component;

public class Tea implements Beverage{
    @Override
    public String describe() {
        return "I am tea. I am popular in India and China.";
    }

    @Override
    public float cost() {
        return 2.99f;
    }
}
