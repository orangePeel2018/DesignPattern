package com.creativeType.factory.simplyFactory.facotrymethod.order;

import com.creativeType.factory.simplyFactory.facotrymethod.pizza.LDCheesePizza;
import com.creativeType.factory.simplyFactory.facotrymethod.pizza.LDGreekPizza;
import com.creativeType.factory.simplyFactory.facotrymethod.pizza.Pizza;

public class LDOrderPizza extends OrderPizza {
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("c")) {
            pizza = new LDCheesePizza();
        } else if (orderType.equals("g")) {
            pizza = new LDGreekPizza();
        }
        // TODO Auto-generated method stub
        return pizza;
    }
}
