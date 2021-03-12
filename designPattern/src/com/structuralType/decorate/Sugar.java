package com.structuralType.decorate;

public class Sugar extends Decorate {

    public Sugar(Drink drink) {
        super(drink);
        setDes("白糖");
        setPrice(2.6);
    }
}
