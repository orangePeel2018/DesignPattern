package com.structuralType.adapter.objectAdapter;


public class Client {
    public static void main(String[] args) {
        Phone phone=new Phone();
        Plug plug=new Plug(new Volt220());
        phone.charge(plug);
    }
}
