package com.creativeType.prototype.pro;

public class client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Sheep sheep=new Sheep("杰",0);
        Sheep sheep1= (Sheep) sheep.clone();
        Sheep sheep2= (Sheep) sheep.clone();
        Sheep sheep3= (Sheep) sheep.clone();
        Sheep sheep4= (Sheep) sheep.clone();
        Sheep sheep5= (Sheep) sheep.clone();

        System.out.println(sheep+"-----------"+sheep.hashCode());
        System.out.println(sheep1+"-----------"+sheep.hashCode());
        System.out.println(sheep2+"-----------"+sheep.hashCode());
        System.out.println(sheep3+"-----------"+sheep.hashCode());
        System.out.println(sheep4+"-----------"+sheep.hashCode());
        System.out.println(sheep5+"-----------"+sheep.hashCode());

    }
}
