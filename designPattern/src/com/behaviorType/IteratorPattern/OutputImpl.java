package com.behaviorType.IteratorPattern;

import java.util.Iterator;
import java.util.List;

public class OutputImpl {

    private List<College> colleges;

    public OutputImpl(List<College> colleges) {
        this.colleges = colleges;
    }

    public void print(){
        Iterator<College> iterator = colleges.iterator();
        while (iterator.hasNext()){
            College c = iterator.next();
            System.out.println("--------"+c.getName()+"---------");
            printDepartments(c.getIterator());
        }
    }

    public void printDepartments(Iterator iterator){
        while(iterator.hasNext()){
            Department department = (Department) iterator.next();
            System.out.println(department.getName());
        }
    }
}
