package com.yash.factory_method.factory;

import com.yash.factory_method.plan.CommercialPlan;
import com.yash.factory_method.plan.DomesticPlan;
import com.yash.factory_method.plan.Plan;

public class USAGetPlan implements InterfaceGetPlan{
    @Override
    public Plan getPlan(char category) throws Exception {
        switch (category) {
            case 'A': return new CommercialPlan();
            case 'B': return new DomesticPlan();
            default: throw new Exception("No/Incorrect category provided.");
        }
    }
}
