package com.structuralType.decorate;

public abstract class Coffee extends Drink{

    @Override
    public double cost() {
        return super.getPrice();
    }
}
