package com.behaviorType.IteratorPattern;


import java.util.Iterator;

public class ComputerCollege implements College {

    private Department departments[];
    private int num=0;


    public ComputerCollege() {
        this.departments = new Department[5];
        addDepartment("软件工程");
        addDepartment("信息工程");
        addDepartment("网络工程");
    }

    @Override
    public String getName() {
        return "信息学院";
    }

    @Override
    public void addDepartment(String name) {
        Department department=new Department(name);
        departments[num]=department;
        num++;
    }

    @Override
    public Iterator getIterator() {
        return new ComputerCollegeIterator(departments);
    }
}
