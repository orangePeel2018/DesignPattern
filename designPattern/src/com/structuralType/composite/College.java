package com.structuralType.composite;

import java.util.ArrayList;
import java.util.List;

public class College extends OrganizationComponent {

    private List<OrganizationComponent> organizationComponents=new ArrayList<>();

    public College(String name, String desc) {
        super(name, desc);
    }

    @Override
    protected void print() {
        System.out.println("-------------"+getName()+"----------------");
        for(OrganizationComponent organizationComponent:organizationComponents){
            organizationComponent.print();
        }
    }

    @Override
    public void add(OrganizationComponent organizationComponent) {
        organizationComponents.add(organizationComponent);
    }

    @Override
    public void remove(OrganizationComponent organizationComponent) {
        organizationComponents.remove(organizationComponent);
    }
}
