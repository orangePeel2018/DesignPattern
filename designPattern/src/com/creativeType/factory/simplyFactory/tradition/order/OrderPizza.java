package com.creativeType.factory.simplyFactory.tradition.order;

import com.creativeType.factory.simplyFactory.tradition.pizza.CheesePizza;
import com.creativeType.factory.simplyFactory.tradition.pizza.GreekPizza;
import com.creativeType.factory.simplyFactory.tradition.pizza.Pizza;

import java.io.*;

public class OrderPizza {

    public OrderPizza(){
        String orderType="";
        Pizza pizza=null;
        do {
            orderType=getType();
            if(orderType.equals("c")){
                pizza=new CheesePizza();
                pizza.setName("芝士披萨");
            }else if(orderType.equals("g")){
                pizza=new GreekPizza();
                pizza.setName("夏威夷披萨");
            }else {
                System.out.println("请输入正确的披萨名称");
                break;
            }

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
