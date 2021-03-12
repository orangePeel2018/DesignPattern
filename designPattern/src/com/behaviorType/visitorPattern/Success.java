package com.behaviorType.visitorPattern;

public class Success extends Action {
    @Override
    public void getManResult(Man man) {
        System.out.println("男人的肯定");
    }

    @Override
    public void getWomenResult(Women women) {
        System.out.println("女人的认可");
    }
}
