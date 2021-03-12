package com.structuralType.facade;

public class Lamplight {

    private Lamplight(){

    }
    private static Lamplight lamplight=new Lamplight();

    public static Lamplight getInstance(){
        return lamplight;
    }

    public void dim(){
        System.out.println("Lamplight dim");
    }
    public void light(){
        System.out.println("Lamplight light");
    }
}
