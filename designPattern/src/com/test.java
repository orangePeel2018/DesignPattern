package com;

public class test {
    public static void main(String[] args) {
        demo("1111",222);
    }

    public static void demo(String param,int...args){
        System.out.println(param);
        System.out.println(args);
    }

}
