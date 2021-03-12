package com.structuralType.facade;

public class Client {
    public static void main(String[] args) {
      HomeTheatre homeTheatre=new HomeTheatre();
        homeTheatre.prepare();
        System.out.println("-----------------");
        homeTheatre.start();
        System.out.println("----------------");
        homeTheatre.pause();
        System.out.println("----------------");
        homeTheatre.terminate();
        System.out.println("----------------");
    }
}
