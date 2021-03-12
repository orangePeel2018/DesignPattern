package com.behaviorType.strategyPattern;

public abstract class Duck {

     FlyBehavior flyBehavior;
     QuackBehavior quackBehavior;

    public Duck() {
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public abstract void display();

    public void swim(){
        System.out.println("鸭子会游泳");
    }

    public void quack(){
        if(quackBehavior!=null){
            quackBehavior.quack();
        }
    }

    public void fly(){
        if(flyBehavior!=null){
            flyBehavior.fly();
        }
    }
}
