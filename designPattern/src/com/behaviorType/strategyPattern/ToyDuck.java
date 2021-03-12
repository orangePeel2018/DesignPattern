package com.behaviorType.strategyPattern;

public class ToyDuck extends Duck {
    public ToyDuck(){
        flyBehavior=new NoFlyBehavior();
        quackBehavior=new NoQuackBehavior();
    }

    @Override
    public void display() {
        System.out.println("玩具鸭鸭鸭");
    }
}
