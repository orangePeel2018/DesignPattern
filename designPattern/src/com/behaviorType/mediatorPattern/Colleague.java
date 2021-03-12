package com.behaviorType.mediatorPattern;

public abstract class Colleague {

    private String name;
    private Mediator mediator;

    public Colleague(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }
    public Mediator getMediator(){
        return this.mediator;
    }
    public abstract void sendMessage(int state);
}
