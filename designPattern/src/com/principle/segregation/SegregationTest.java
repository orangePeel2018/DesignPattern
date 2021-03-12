package com.principle.segregation;

public class SegregationTest {

}

interface interface1{
    public void test1();
    public void test2();
    public void test3();
    public void test4();
    public void test5();
}

class B implements  interface1{

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

    @Override
    public void test4() {
        System.out.println("B实现了test4");
    }

    @Override
    public void test5() {
        System.out.println("B实现了test5");
    }
}

class D implements  interface1{

    @Override
    public void test1() {
        System.out.println("D实现了test1");
    }

    @Override
    public void test2() {
        System.out.println("D实现了test2");
    }

    @Override
    public void test3() {
        System.out.println("D实现了test3");
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

class A{
    public void depends1(interface1 i){
        i.test1();
    }
    public void depends2(interface1 i){
        i.test2();
    }
    public void depends3(interface1 i){
        i.test3();
    }
}

class C{
    public void depends1(interface1 i){
        i.test1();
    }
    public void depends2(interface1 i){
        i.test4();
    }
    public void depends3(interface1 i){
        i.test5();
    }
}