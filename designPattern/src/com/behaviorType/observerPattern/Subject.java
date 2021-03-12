package com.behaviorType.observerPattern;

//被观察者(主体)接口类
public interface Subject {

    public void registerObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObserver();
}
