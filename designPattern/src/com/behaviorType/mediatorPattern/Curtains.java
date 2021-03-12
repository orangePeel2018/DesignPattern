package com.behaviorType.mediatorPattern;

public class Curtains extends Colleague {

    public Curtains(String name, Mediator mediator) {
        super(name, mediator);
        mediator.register("Curtains",this);
    }

    @Override
    public void sendMessage(int state) {
        this.getMediator().getMessage(state,"Curtains");
    }

    public void up(){
        System.out.println("窗帘上升");
    }
    public void down(){
        System.out.println("窗帘下降");
    }
}
