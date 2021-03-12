package com.behaviorType.strategyPattern;

public class GoodQuackBehavior implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("此鸭子叫：呀呀呀");
    }
}
