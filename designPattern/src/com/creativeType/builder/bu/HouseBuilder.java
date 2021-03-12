package com.creativeType.builder.bu;

public abstract class HouseBuilder {
    protected House house=new House();

    public abstract void buildPile();
    public abstract void buildWall();
    public abstract void buildRoof();

    public House getHouse(){
        return house;
    }
}
