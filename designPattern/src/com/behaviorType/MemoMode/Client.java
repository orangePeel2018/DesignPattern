package com.behaviorType.MemoMode;

public class Client {
    public static void main(String[] args) {
        GameRole gameRole=new GameRole();
        gameRole.setDef(100);
        gameRole.setVit(100);

        gameRole.display();
        CareTaker careTaker=new CareTaker();
        careTaker.setMemento(gameRole.getMemento());

        gameRole.setVit(20);
        gameRole.setVit(10);
        gameRole.display();

        gameRole.getInfoFromMemento(careTaker.getMemento());

        gameRole.display();
    }
}
