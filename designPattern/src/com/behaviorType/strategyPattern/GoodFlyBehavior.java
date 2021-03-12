package com.behaviorType.strategyPattern;

public class GoodFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("此鸭子飞得很牛");
    }
}
