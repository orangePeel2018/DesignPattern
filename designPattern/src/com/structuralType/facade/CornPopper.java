package com.structuralType.facade;

public class CornPopper {

    private CornPopper(){

    }
    private static CornPopper cornPopper=new CornPopper();

    public static CornPopper getInstance(){
        return cornPopper;
    }

    public void on(){
        System.out.println("CornPopper on");
    }

    public void off(){
        System.out.println("CornPopper off");
    }

    public void get(){
        System.out.println("get CornPopper");
    }
}
