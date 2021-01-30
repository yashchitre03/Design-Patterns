package com.yash.strategy.algorithms;

public class Quack implements QuackBehavior{
    @Override
    public String quack() {
        return "Quack, quack";
    }
}
