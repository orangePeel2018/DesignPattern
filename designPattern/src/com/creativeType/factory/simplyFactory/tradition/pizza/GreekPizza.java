package com.creativeType.factory.simplyFactory.tradition.pizza;

public class GreekPizza extends Pizza{

    @Override
    public void prepare() {
        System.out.println("准备GreekPizza所需的材料");
    }
}
