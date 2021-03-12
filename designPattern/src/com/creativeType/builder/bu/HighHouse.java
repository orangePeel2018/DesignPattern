package com.creativeType.builder.bu;



public class HighHouse extends  HouseBuilder{

    @Override
    public void buildPile() {
        System.out.println("房子打地基5米");
    }

    @Override
    public void buildWall() {
        System.out.println("房子建墙10米");
    }

    @Override
    public void buildRoof() {
        System.out.println("房子盖豪华房顶");
    }
}
