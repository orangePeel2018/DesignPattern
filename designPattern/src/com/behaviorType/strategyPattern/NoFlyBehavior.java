package com.behaviorType.strategyPattern;

public class NoFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("此鸭不会飞");
    }
}
