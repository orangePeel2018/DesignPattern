package com.behaviorType.observerPattern;

public class Client {
    public static void main(String[] args) {

        BaiDu baiDu=new BaiDu();
        WeatherData weatherData=new WeatherData();
        weatherData.registerObserver(baiDu);
        weatherData.registerObserver(new WeChat());

        weatherData.setData(1,2,3);
    }
}
