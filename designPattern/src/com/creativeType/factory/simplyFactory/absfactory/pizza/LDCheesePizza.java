package com.creativeType.factory.simplyFactory.absfactory.pizza;

public class LDCheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("准备CheesePizza所需的材料");
    }
}
