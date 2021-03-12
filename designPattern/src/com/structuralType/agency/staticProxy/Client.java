package com.structuralType.agency.staticProxy;

public class Client {
    public static void main(String[] args) {
        TeachDao teachDao=new TeachDao();
        TeachProxy teachProxy=new TeachProxy(teachDao);
        teachProxy.teach();
    }
}
