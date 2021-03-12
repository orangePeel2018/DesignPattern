package com.creativeType.prototype.deep;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Sheep sheep=new Sheep("羊",1);
        sheep.setWool(new Wool("red"));
        Sheep sheep1= (Sheep) sheep.clone();
        Sheep sheep2= (Sheep) sheep.clone();
        Sheep sheep3= (Sheep) sheep.clone();
        Sheep sheep4= (Sheep) sheep.clone();
        Sheep sheep5= (Sheep) sheep.clone();

        System.out.println(sheep+"----"+sheep.hashCode()+"-------"+sheep.getWool()+"---------"+sheep.getWool().hashCode());
        System.out.println(sheep1+"----"+sheep1.hashCode()+"-------"+sheep1.getWool()+"---------"+sheep1.getWool().hashCode());
        System.out.println(sheep2+"----"+sheep2.hashCode()+"-------"+sheep2.getWool()+"---------"+sheep2.getWool().hashCode());
        System.out.println(sheep3+"----"+sheep3.hashCode()+"-------"+sheep3.getWool()+"---------"+sheep3.getWool().hashCode());
        System.out.println(sheep4+"----"+sheep4.hashCode()+"-------"+sheep4.getWool()+"---------"+sheep4.getWool().hashCode());
        System.out.println(sheep5+"----"+sheep5.hashCode()+"-------"+sheep5.getWool()+"---------"+sheep5.getWool().hashCode());

        System.out.println("--------------------------------------------------------------------------------------------------");

        Sheep deepSheep=new Sheep("深羊",6);
        deepSheep.setWool(new Wool("blue"));
        Sheep deepSheep1= (Sheep) deepSheep.deepClone();
        Sheep deepSheep2= (Sheep) deepSheep.deepClone();
        Sheep deepSheep3= (Sheep) deepSheep.deepClone();
        Sheep deepSheep4= (Sheep) deepSheep.deepClone();
        Sheep deepSheep5= (Sheep) deepSheep.deepClone();


        System.out.println(deepSheep+"----"+deepSheep.hashCode()+"-------"+deepSheep.getWool()+"---------"+deepSheep.getWool().hashCode());
        System.out.println(deepSheep1+"----"+deepSheep1.hashCode()+"-------"+deepSheep1.getWool()+"---------"+deepSheep1.getWool().hashCode());
        System.out.println(deepSheep2+"----"+deepSheep2.hashCode()+"-------"+deepSheep2.getWool()+"---------"+deepSheep2.getWool().hashCode());
        System.out.println(deepSheep3+"----"+deepSheep3.hashCode()+"-------"+deepSheep3.getWool()+"---------"+deepSheep3.getWool().hashCode());
        System.out.println(deepSheep4+"----"+deepSheep4.hashCode()+"-------"+deepSheep4.getWool()+"---------"+deepSheep4.getWool().hashCode());
        System.out.println(deepSheep5+"----"+deepSheep5.hashCode()+"-------"+deepSheep5.getWool()+"---------"+deepSheep5.getWool().hashCode());


    }
}
