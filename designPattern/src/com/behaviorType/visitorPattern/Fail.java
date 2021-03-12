package com.behaviorType.visitorPattern;

public class Fail extends Action {
    @Override
    public void getManResult(Man man) {
        System.out.println("男人的摇头");
    }

    @Override
    public void getWomenResult(Women women) {
        System.out.println("女人的头疼");
    }
}
