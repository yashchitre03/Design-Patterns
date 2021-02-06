package com.yash.factory_method.Client;

import com.yash.factory_method.factory.IndiaGetPlan;
import com.yash.factory_method.plan.Plan;

public class Main {
    public static void main(String[] args) throws Exception {
        Plan newPlan = new IndiaGetPlan().getPlan('A');
        double bill = newPlan.calculate(100);
        System.out.println("The current bill is: " + bill);
    }
}
