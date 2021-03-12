package com.creativeType.factory.simplyFactory.tradition.pizza;

public abstract class Pizza {
    protected String name;

    public void setName(String name) {
        this.name = name;
    }

    public abstract void prepare();

    public void bake(){
        System.out.println(name+"----烤");
    }
    public void cut(){
        System.out.println(name+"----切");
    }
    public void pack(){
        System.out.println(name+"----打包");
    }
}