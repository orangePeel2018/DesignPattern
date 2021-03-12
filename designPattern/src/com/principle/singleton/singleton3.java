package com.principle.singleton;

public class singleton3 {
    public static void main(String[] args) {
        RoadVehicle roadVehicle=new RoadVehicle();
        roadVehicle.run("汽车");
        AirVehicle airVehicle=new AirVehicle();
        airVehicle.run("飞机");
        SeaVehicle seaVehicle=new SeaVehicle();
        seaVehicle.run("轮船");
    }
}
//类单一原则
class RoadVehicle{
    public void run(String ve){
        System.out.println(ve+"在陆地跑");
    }
}

class AirVehicle{
    public void run(String ve){
        System.out.println(ve+"在天空飞");
    }
}

class SeaVehicle{
    public void run(String ve){
        System.out.println(ve+"在海航线");
    }
}