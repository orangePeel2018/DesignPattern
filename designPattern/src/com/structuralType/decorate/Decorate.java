package com.structuralType.decorate;

public class Decorate extends Drink {

    private Drink drink;

    public Decorate(Drink drink) {
        this.drink=drink;
    }

    @Override
    public double cost() {
        return super.getPrice()+drink.cost();
    }
}
