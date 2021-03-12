package com.creativeType.factory.simplyFactory.simplyFactory.pizza;

public class CheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("准备CheesePizza所需的材料");
    }
}
