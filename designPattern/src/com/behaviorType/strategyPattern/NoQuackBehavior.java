package com.behaviorType.strategyPattern;

public class NoQuackBehavior implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("此鸭子不会叫啊");
    }
}
