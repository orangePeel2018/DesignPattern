package com.structuralType.facade;

public class SurroundSound {

    private SurroundSound(){

    }

    private static SurroundSound surroundSound=new SurroundSound();

    public static SurroundSound getInstance(){
        return surroundSound;
    }

    public void on(){
        System.out.println("SurroundSound on");
    }

    public void off(){
        System.out.println("SurroundSound off");
    }

    public void pause(){
        System.out.println("SurroundSound pause");
    }
}
