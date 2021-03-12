package com.structuralType.agency.staticProxy;

public class TeachDao implements ITeachDao {

    @Override
    public void teach() {
        System.out.println("teach....中");
    }
}
