package com.behaviorType.strategyPattern;

public class BadFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("此鸭子飞得一般啊");
    }
}
