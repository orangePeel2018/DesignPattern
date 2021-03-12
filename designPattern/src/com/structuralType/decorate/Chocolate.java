package com.structuralType.decorate;

public class Chocolate extends Decorate {

    public Chocolate(Drink drink) {
        super(drink);
        setDes("巧克力");
        setPrice(3.2);
    }
}
