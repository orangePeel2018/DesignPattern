package com.behaviorType.strategyPattern;

public class WildDuck extends Duck {

    public WildDuck(){
        flyBehavior=new GoodFlyBehavior();
        quackBehavior=new GoodQuackBehavior();
    }

    @Override
    public void display() {
        System.out.println("野生鸭子");
    }
}
