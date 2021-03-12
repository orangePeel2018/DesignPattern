package com.behaviorType.strategyPattern;

public class PekingDuck extends Duck {

    public PekingDuck(){
        flyBehavior=new BadFlyBehavior();
        quackBehavior=new NoQuackBehavior();
    }

    @Override
    public void display() {
        System.out.println("北京鸭");
    }
}
