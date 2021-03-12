package com.behaviorType.mediatorPattern;

public class TV extends Colleague{

    public TV(String name, Mediator mediator) {
        super(name, mediator);
        mediator.register("TV",this);
    }

    @Override
    public void sendMessage(int state) {
        // TODO Auto-generated method stub
        this.getMediator().getMessage(state,"TV");
    }

    public void startTv() {
        // TODO Auto-generated method stub
        System.out.println("It's time to StartTv!");
    }

    public void stopTv() {
        // TODO Auto-generated method stub
        System.out.println("StopTv!");
    }
}
