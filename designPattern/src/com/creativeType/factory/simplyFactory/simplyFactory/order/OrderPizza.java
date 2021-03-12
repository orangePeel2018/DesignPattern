package com.creativeType.factory.simplyFactory.simplyFactory.order;


import com.creativeType.factory.simplyFactory.simplyFactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {
    SimplyFactory simplyFactory;
    Pizza pizza=null;
    public OrderPizza(SimplyFactory simplyFactory){
        setFactory(simplyFactory);
    }
    public void setFactory(SimplyFactory simplyFactory){
        this.simplyFactory=simplyFactory;
        String orderType="";
        do {
            orderType=getType();
            pizza=this.simplyFactory.getPizza(orderType);
            pizza.bake();
            pizza.cut();
            pizza.pack();
        }while (true);
    }

    public String getType() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入你要预定的pizza：");
        try {
            String s = bufferedReader.readLine();
            return s;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
