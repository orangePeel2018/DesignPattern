package com.creativeType.factory.simplyFactory.absfactory.order;



import com.creativeType.factory.simplyFactory.absfactory.pizza.CNCheesePizza;
import com.creativeType.factory.simplyFactory.absfactory.pizza.CNGreekPizza;
import com.creativeType.factory.simplyFactory.absfactory.pizza.Pizza;

public class CNFactory implements AbsFactory {
    @Override
    public Pizza getPizza(String orderType) {
        Pizza pizza=null;
        if(orderType.equals("g")){
            pizza=new CNGreekPizza();
            pizza.setName("CN夏威夷披萨");
        }else if(orderType.equals("c")){
            pizza=new CNCheesePizza();
            pizza.setName("CN芝士披萨");
        }
        return pizza;
    }
}
