package com.yash.strategy.algorithms;

public class FlyWithWings implements FlyBehavior {
    @Override
    public String fly() {
        return "I can fly, yay!";
    }
}
