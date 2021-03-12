package com.behaviorType.observerPattern;

public class WeChat implements Observer{

    private int temperature;
    private int pressure;
    private int humidity;

    @Override
    public void update(int temperature, int pressure, int humidity) {
        this.temperature=temperature;
        this.pressure=pressure;
        this.humidity=humidity;
        display();
    }

    public void display(){
        System.out.println("=========微信网站==========");
        System.out.println("微信网站今日温度"+this.temperature);
        System.out.println("微信网站今日气压"+this.pressure);
        System.out.println("微信网站今日湿度"+this.humidity);
    }
}

