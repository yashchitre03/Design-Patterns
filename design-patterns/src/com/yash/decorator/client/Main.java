package com.yash.decorator.client;

import com.yash.decorator.component.Beverage;
import com.yash.decorator.component.Tea;
import com.yash.decorator.decorator.WithMilkDecorator;
import com.yash.decorator.decorator.WithSugarDecorator;

public class Main {

    public static void main(String[] args) {
        Beverage tea = new Tea();
        printInfo(tea);

        tea = new WithMilkDecorator(tea);
        printInfo(tea);

        tea = new WithSugarDecorator(tea);
        printInfo(tea);
    }

    public static void printInfo(Beverage beverage) {
        System.out.println(beverage.describe() + " COST: " + beverage.cost());
    }
}
