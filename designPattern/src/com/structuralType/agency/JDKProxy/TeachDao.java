package com.structuralType.agency.JDKProxy;

public class TeachDao implements ITeachDao {
    @Override
    public void teach() {
        System.out.println("动态代理授课中");
    }
}
