package com.creativeType.factory.simplyFactory.facotrymethod.pizza;

public class CNCheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("准备CheesePizza所需的材料");
    }
}
