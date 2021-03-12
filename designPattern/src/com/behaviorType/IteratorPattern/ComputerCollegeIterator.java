package com.behaviorType.IteratorPattern;

import java.util.Iterator;

public class ComputerCollegeIterator implements Iterator {

    private Department departments[];//数组形式
    private int num=0;

    public ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        if(departments[num]!=null){

            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        Department department=departments[num];
        num++;
        return department;
    }

    @Override
    public void remove() {

    }
}
