package com.principle.lisi;

public class LisKov {
    public static void main(String[] args) {
        B b=new B();
        b.func3(1,1);
    }
}

class C{

}

class A extends C {
    public int func1(int a, int b) {
        return a - b;
    }
}
class B extends C {
    //这里是用组合的方式使用A
    private A a=new A();

    public int func1(int a, int b) {
        return a + b;
    }
    public int func2(int a, int b) {
        return func1(a, b) + 9;
    }
    public int func3(int a, int b){
        return this.a.func1(a,b);
    }
}
