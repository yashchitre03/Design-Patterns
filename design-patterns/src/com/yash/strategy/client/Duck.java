package com.yash.strategy.client;

import com.yash.strategy.algorithms.FlyBehavior;
import com.yash.strategy.algorithms.QuackBehavior;

public class Duck {
    FlyBehavior fly;
    QuackBehavior quack;

    public void setFly(FlyBehavior fly) {
        this.fly = fly;
    }

    public void setQuack(QuackBehavior quack) {
        this.quack = quack;
    }

    public void performFly() {
        System.out.println(fly.fly());
    }

    public void performQuack() {
        System.out.println(quack.quack());
    }
}
