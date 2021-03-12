package com.behaviorType.IteratorPattern;

import java.util.Iterator;

public interface College {

    public String getName();

    public void addDepartment(String name);

    public Iterator getIterator();
}
