package com.creativeType.prototype.trandition;

public class Client {
    public static void main(String[] args) {
        Sheep sheep=new Sheep("阿杰",1);//原型
        Sheep sheep1=new Sheep(sheep.getName(),sheep.getAge());
        Sheep sheep2=new Sheep(sheep.getName(),sheep.getAge());
        Sheep sheep3=new Sheep(sheep.getName(),sheep.getAge());
        Sheep sheep4=new Sheep(sheep.getName(),sheep.getAge());
        Sheep sheep5=new Sheep(sheep.getName(),sheep.getAge());

        System.out.println(sheep.hashCode());
        System.out.println(sheep1.hashCode());
        System.out.println(sheep2.hashCode());
        System.out.println(sheep3.hashCode());
        System.out.println(sheep4.hashCode());
        System.out.println(sheep5.hashCode());

    }
}
