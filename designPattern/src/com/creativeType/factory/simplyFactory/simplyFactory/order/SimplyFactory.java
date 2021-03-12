package com.creativeType.factory.simplyFactory.simplyFactory.order;

import com.creativeType.factory.simplyFactory.simplyFactory.pizza.CheesePizza;
import com.creativeType.factory.simplyFactory.simplyFactory.pizza.GreekPizza;
import com.creativeType.factory.simplyFactory.simplyFactory.pizza.Pizza;

public class SimplyFactory {

    public Pizza getPizza(String orderType){
        Pizza pizza=null;
        if(orderType.equals("g")){
            pizza=new GreekPizza();
            pizza.setName("夏威夷披萨");
        }else if(orderType.equals("c")){
            pizza=new CheesePizza();
            pizza.setName("芝士披萨");
        }
        return pizza;
    }
}
