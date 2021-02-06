package com.yash.factory_method.factory;

import com.yash.factory_method.plan.CommercialPlan;
import com.yash.factory_method.plan.DomesticPlan;
import com.yash.factory_method.plan.Plan;

public class IndiaGetPlan implements InterfaceGetPlan{
    @Override
    public Plan getPlan(char category) throws Exception {
        switch (category) {
            case 'A': return new DomesticPlan();
            case 'B': return new CommercialPlan();
            default: throw new Exception("No/Incorrect category provided.");
        }
    }
}
