package com.principle.singleton;

public class singleton1 {
    public static void main(String[] args) {
        Vehicle vehicle=new Vehicle();
        vehicle.run("轮船");
        vehicle.run("飞机");
    }
}

//非单一模式
class Vehicle{
    public void  run(String ve){
        System.out.println(ve+"在公路运行");
    }
}