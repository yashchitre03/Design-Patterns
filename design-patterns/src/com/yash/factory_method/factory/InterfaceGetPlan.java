package com.yash.factory_method.factory;

import com.yash.factory_method.plan.Plan;

public interface InterfaceGetPlan {
    Plan getPlan(char category) throws Exception;
}
