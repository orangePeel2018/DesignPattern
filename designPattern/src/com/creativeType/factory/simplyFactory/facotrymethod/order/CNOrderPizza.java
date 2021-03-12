package com.creativeType.factory.simplyFactory.facotrymethod.order;

import com.creativeType.factory.simplyFactory.facotrymethod.pizza.CNCheesePizza;
import com.creativeType.factory.simplyFactory.facotrymethod.pizza.CNGreekPizza;
import com.creativeType.factory.simplyFactory.facotrymethod.pizza.Pizza;

public class CNOrderPizza  extends OrderPizza{
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("c")) {
            pizza = new CNCheesePizza();
        } else if (orderType.equals("g")) {
            pizza = new CNGreekPizza();
        }
        // TODO Auto-generated method stub
        return pizza;
    }
}
