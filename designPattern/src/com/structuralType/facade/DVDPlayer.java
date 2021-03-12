package com.structuralType.facade;

public class DVDPlayer {

    private DVDPlayer(){

    }

    private static DVDPlayer dvdPlayer=new DVDPlayer();

    public static DVDPlayer getInstance(){
        return dvdPlayer;
    }

    public void on(){
        System.out.println("DVD on");
    }

    public void off(){
        System.out.println("DVD off");
    }

    public void play(){
        System.out.println("DVD play");
    }

    public void pause(){
        System.out.println("DVD pause");
    }
}
