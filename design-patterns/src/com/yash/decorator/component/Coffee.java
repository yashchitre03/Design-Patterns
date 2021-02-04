package com.yash.decorator.component;

public class Coffee implements Beverage{
    @Override
    public String describe() {
        return "I am coffee. I am popular in US and Europe.";
    }

    @Override
    public float cost() {
        return 1.99f;
    }
}
