package com.creativeType.builder.bu;

public class Director {

    private HouseBuilder houseBuilder;

    public Director(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public House constructHouse(){
        houseBuilder.buildPile();
        houseBuilder.buildWall();
        houseBuilder.buildRoof();
        return houseBuilder.getHouse();
    }
}
