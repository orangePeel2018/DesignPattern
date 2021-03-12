package com.behaviorType.mediatorPattern;

public class CoffeeMachine extends Colleague{


    public CoffeeMachine(String name, Mediator mediator) {
        super(name, mediator);
        mediator.register("CoffeeMachine",this);
    }

    @Override
    public void sendMessage(int state) {
        this.getMediator().getMessage(state,"CoffeeMachine");
    }

    public void on(){
        System.out.println("咖啡机打开");
    }

    public void off(){
        System.out.println("咖啡机关闭");
    }
}
