package com.yash.strategy.client;

import com.yash.strategy.algorithms.*;

public class Main {
    public static void main(String[] args) {
        FlyBehavior fly = new FlyWithWings();
        QuackBehavior quack = new Quack();
        Duck donald = new Duck();
        donald.setFly(fly);
        donald.setQuack(quack);

        donald.performFly();
        donald.performQuack();
    }
}

