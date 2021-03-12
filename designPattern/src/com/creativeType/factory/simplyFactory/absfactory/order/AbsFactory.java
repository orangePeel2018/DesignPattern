package com.creativeType.factory.simplyFactory.absfactory.order;


import com.creativeType.factory.simplyFactory.absfactory.pizza.Pizza;

public  interface  AbsFactory {

    public abstract Pizza getPizza(String orderType);
}
