package com.principle.segregation;

public class SegregationTest2{
    public static void main(String[] args) {
        AA aa=new AA();
        aa.depends1(new BB());
        aa.depends2(new BB());
        aa.depends3(new BB());

        CC cc=new CC();
        cc.depends1(new DD());
        cc.depends2(new DD());
        cc.depends3(new DD());
    }
}

interface interface2{
    public void test1();
}
interface interface3{
    public void test2();
    public void test3();
}
interface interface4{
    public void test4();
    public void test5();
}

class BB implements  interface2,interface3{

    @Override
    public void test1() {
        System.out.println("B实现了test1");
    }

    @Override
    public void test2() {
        System.out.println("B实现了test2");
    }

    @Override
    public void test3() {
        System.out.println("B实现了test3");
    }
}

class DD implements  interface2,interface4{

    @Override
    public void test1() {
        System.out.println("D实现了test1");
    }

    @Override
    public void test4() {
        System.out.println("D实现了test4");
    }

    @Override
    public void test5() {
        System.out.println("D实现了test5");
    }
}

class AA{
    public void depends1(interface2 i){
        i.test1();
    }
    public void depends2(interface3 i){
        i.test2();
    }
    public void depends3(interface3 i){
        i.test3();
    }
}

class CC{
    public void depends1(interface2 i){
        i.test1();
    }
    public void depends2(interface4 i){
        i.test4();
    }
    public void depends3(interface4 i){
        i.test5();
    }
}