package com.structuralType.composite;

public class Client {
    public static void main(String[] args) {

        University university=new University("广东理工学院","弟弟学校");

        College college=new College("信息学院","教混子");
        College college2=new College("艺术学院","教婆娘");

        Department department=new Department("软件工程","学划水");
        Department department2=new Department("软件技术","学摸鱼");
        Department department3=new Department("软件爬虫","学捉虫");

        Department department4=new Department("服装","做衣服");
        Department department5=new Department("画画","学画画");

        college.add(department);
        college.add(department2);
        college.add(department3);
        college2.add(department4);
        college2.add(department5);

        university.add(college);
        university.add(college2);

        university.print();
    }
}
