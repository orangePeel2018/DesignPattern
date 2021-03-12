package com.yan;

public class Student {
    private  String name;
    private  String age;

    public Student() {

    }

    public Student(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void show(String name, String age) {
        System.out.println(this.name + "," + this.age);
    }
}
