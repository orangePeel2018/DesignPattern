package com.creativeType.builder.tradition;

public abstract class AbsBuilderHouse {
    public abstract void  pile();
    public abstract void  wall();
    public abstract void  roof();

    public void builder(){
        pile();
        wall();
        roof();
    }
}
