package com.principle.singleton;

public class singleton2 {
    public static void main(String[] args) {
        Vehicle2 vehicle2=new Vehicle2();
        vehicle2.runRoad("汽车");
        vehicle2.runAir("飞机");
        vehicle2.runSea("轮船");
    }
}

//非标准单例模式，在方法少的情况下，可以在方法中实现单例
class Vehicle2{
    public void runRoad(String ve){
        System.out.println(ve+"在公路上跑");
    }

    public void runAir(String ve){
        System.out.println(ve+"在天空上飞行");
    }

    public void  runSea(String ve){
        System.out.println(ve+"在大海上航行");
    }
}