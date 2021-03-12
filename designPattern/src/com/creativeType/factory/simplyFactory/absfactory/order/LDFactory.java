package com.creativeType.factory.simplyFactory.absfactory.order;


import com.creativeType.factory.simplyFactory.absfactory.pizza.LDCheesePizza;
import com.creativeType.factory.simplyFactory.absfactory.pizza.LDGreekPizza;
import com.creativeType.factory.simplyFactory.absfactory.pizza.Pizza;

public class LDFactory implements AbsFactory {
    @Override
    public Pizza getPizza(String orderType) {
        Pizza pizza=null;
        if(orderType.equals("g")){
            pizza=new LDGreekPizza();
            pizza.setName("LD夏威夷披萨");
        }else if(orderType.equals("c")){
            pizza=new LDCheesePizza();
            pizza.setName("LD芝士披萨");
        }
        return pizza;
    }
}
