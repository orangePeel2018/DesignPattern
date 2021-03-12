package com.behaviorType.observerPattern;

import java.util.ArrayList;
import java.util.List;

//
public class WeatherData implements Subject{
    private int temperature;
    private int pressure;
    private int humidity;
    //观察者集合
    private List<Observer> observerList;

    public WeatherData() {
        this.observerList =new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        if(observerList.contains(observer)){
            observerList.remove(observer);
        }
    }

    @Override
    public void notifyObserver() {
        for(Observer observer:observerList){
            if (observer!=null) {
                observer.update(temperature, pressure, humidity);
            }
        }
    }

    public void setData(int temperature,int pressure,int humidity){
        this.temperature=temperature;
        this.pressure=pressure;
        this.humidity=humidity;
        System.out.println("----主体类天气数据更新----");
        notifyObserver();
    }
}
