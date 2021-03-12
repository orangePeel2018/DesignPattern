package com.creativeType.singleton.type1;

public class SingletonTest {
    public static void main(String[] args) {
        Singleton singleton=Singleton.getInstance();
        Singleton singleton2=Singleton.getInstance();
        System.out.println(singleton==singleton2);
        System.out.println("singleton的hashcode："+singleton.hashCode());
        System.out.println("singleton2的hashcode："+singleton2.hashCode());


    }
}

//饿汉式（静态常量）
class Singleton{
    //私有构造方法
    private Singleton(){

    }
    //创建对象实例
    private static Singleton instance=new Singleton();

    //对外提供获取对象实例方法
    public static Singleton getInstance(){
        return instance;
    }
}