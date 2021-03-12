package com.creativeType.factory.simplyFactory.facotrymethod.pizza;

public class CNGreekPizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("准备GreekPizza所需的材料");
    }
}
