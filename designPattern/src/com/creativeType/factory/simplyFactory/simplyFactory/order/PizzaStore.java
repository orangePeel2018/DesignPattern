package com.creativeType.factory.simplyFactory.simplyFactory.order;

public class PizzaStore {
    public static void main(String[] args) {
        SimplyFactory simplyFactory=new SimplyFactory();
        new OrderPizza(simplyFactory);
    }
}
