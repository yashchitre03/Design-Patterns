package com.yash.strategy.algorithms;

public class FlyNoWay implements FlyBehavior{
    @Override
    public String fly() {
        return "Sorry, I cannot fly.";
    }
}
