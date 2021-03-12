package com.structuralType.composite;

//组合中对象声明
public abstract class OrganizationComponent {

    private String name;
    private String desc;

    public OrganizationComponent(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    protected void add(OrganizationComponent organizationComponent){
        throw new UnsupportedOperationException();
    }
    protected void remove(OrganizationComponent organizationComponent){
        throw new UnsupportedOperationException();
    }
    protected abstract void print();

}
