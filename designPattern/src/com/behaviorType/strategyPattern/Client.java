package com.behaviorType.strategyPattern;

public class Client {
    public static void main(String[] args) {
        ToyDuck toyDuck=new ToyDuck();
        toyDuck.quack();
        toyDuck.fly();
        toyDuck.swim();

        PekingDuck pekingDuck=new PekingDuck();
        pekingDuck.quack();
        pekingDuck.fly();
    }
}
