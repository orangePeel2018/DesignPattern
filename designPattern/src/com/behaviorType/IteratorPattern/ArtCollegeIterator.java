package com.behaviorType.IteratorPattern;

import java.util.Iterator;
import java.util.List;

public class ArtCollegeIterator implements Iterator {

    private List<Department> departments;
    private int num=-1;

    public ArtCollegeIterator(List<Department> departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        if (num>=departments.size()-1){
            return false;
        }
        num++;
        return true;
    }

    @Override
    public Object next() {
        Department department = departments.get(num);
        return department;
    }

    @Override
    public void remove() {

    }
}
