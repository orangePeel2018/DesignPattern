package com.behaviorType.mediatorPattern;

public class Alarm extends Colleague {

    public Alarm(String name, Mediator mediator) {
        super(name, mediator);
        mediator.register("Alarm",this);
    }

    @Override
    public void sendMessage(int state) {
        this.getMediator().getMessage(state,"Alarm");
    }
    public void alarm(int state){
        sendMessage(state);
    }
}
