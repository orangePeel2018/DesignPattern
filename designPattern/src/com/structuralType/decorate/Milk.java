package com.structuralType.decorate;

public class Milk extends Decorate{

    public Milk(Drink drink) {
        super(drink);
        setDes("牛奶");
        setPrice(1.5);
    }
}
