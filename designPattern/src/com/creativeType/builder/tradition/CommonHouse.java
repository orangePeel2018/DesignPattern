package com.creativeType.builder.tradition;

public class CommonHouse extends AbsBuilderHouse {
    @Override
    public void pile() {
        System.out.println("打地基");
    }

    @Override
    public void wall() {
        System.out.println("砌墙");
    }

    @Override
    public void roof() {
        System.out.println("盖屋顶");
    }
}
