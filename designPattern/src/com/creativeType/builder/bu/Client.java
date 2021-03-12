package com.creativeType.builder.bu;



public class Client {
    public static void main(String[] args) {
        CommonHouse commonHouse=new CommonHouse();
        Director director=new Director(commonHouse);
        House house=director.constructHouse();
        System.out.println(house);
    }
}
