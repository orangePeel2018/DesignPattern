package com.structuralType.facade;

public class Screen {

    private Screen(){

    }

    private static  Screen screen=new Screen();

    public static Screen getInstance(){
        return screen;
    }

    public void down(){
        System.out.println("Screen down");
    }

    public void up(){
        System.out.println("Screen up");
    }
}
