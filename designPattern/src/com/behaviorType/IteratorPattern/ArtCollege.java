package com.behaviorType.IteratorPattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArtCollege implements College {

    private List<Department> departments;

    public ArtCollege() {
        this.departments = new ArrayList<>();
        addDepartment("服装工程");
        addDepartment("室内设计");
        addDepartment("画画工程");
    }

    @Override
    public String getName() {
        return "艺术系";
    }

    @Override
    public void addDepartment(String name) {
        departments.add(new Department(name));
    }

    @Override
    public Iterator getIterator() {
        return new ArtCollegeIterator(departments);
    }
}
