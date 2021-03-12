package com.creativeType.factory.simplyFactory.absfactory.order;

public class PizzaStore {
    public static void main(String[] args) {
        CNFactory cnFactory=new CNFactory();
        new OrderPizza(cnFactory);
    }
}
