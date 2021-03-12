package com.creativeType.builder.bu;

public class CommonHouse extends HouseBuilder {
    @Override
    public void buildPile() {
        house.setPile("打地基10米");
        System.out.println(house.getPile());

    }

    @Override
    public void buildWall() {
        house.setWall("贴砖20米");
        System.out.println(house.getWall());
    }

    @Override
    public void buildRoof() {
        house.setRoof("盖普通房顶");
        System.out.println(house.getRoof());
    }
}
