package com.structuralType.adapter.classAdapter;


public class Client {
    public static void main(String[] args) {
        Phone phone=new Phone();
        Plug plug=new Plug();
        phone.charge(plug);
    }
}
