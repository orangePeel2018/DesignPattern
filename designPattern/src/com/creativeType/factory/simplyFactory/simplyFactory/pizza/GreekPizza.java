package com.creativeType.factory.simplyFactory.simplyFactory.pizza;

public class GreekPizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("准备GreekPizza所需的材料");
    }
}
