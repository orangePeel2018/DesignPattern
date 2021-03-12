package com.creativeType.factory.simplyFactory.absfactory.order;


import com.creativeType.factory.simplyFactory.absfactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {
    AbsFactory absFactory;
    Pizza pizza=null;
    public OrderPizza(AbsFactory absFactory){
        setFactory(absFactory);
    }
    public void setFactory(AbsFactory absFactory){
        this.absFactory=absFactory;
        String orderType="";
        do {
            orderType=getType();
            pizza=this.absFactory.getPizza(orderType);
            if(pizza==null) {
                System.out.println("请输入正确的pizza名称");
                break;
            }
            pizza.prepare();
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
