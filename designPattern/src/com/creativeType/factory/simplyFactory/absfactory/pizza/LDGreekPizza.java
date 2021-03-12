package com.creativeType.factory.simplyFactory.absfactory.pizza;

public class LDGreekPizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("准备GreekPizza所需的材料");
    }
}
