package com.structuralType.facade;

public class Projector {

    private Projector(){

    }
    private static Projector projector=new Projector();

    public static Projector getInstance(){
        return projector;
    }

    public void on(){
        System.out.println("Projector on");
    }

    public void off(){
        System.out.println("Projector off");
    }

    public void focus(){
        System.out.println("focus play");
    }


}
