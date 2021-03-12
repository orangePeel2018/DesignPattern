package com.creativeType.singleton.type2;

public class SingletonTest {
    public static void main(String[] args) {
        Singleton singleton= Singleton.getInstance();
        Singleton singleton2= Singleton.getInstance();
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
    //通过静态代码块创建对象
    private static Singleton instance=null;

    static {
        instance=new Singleton();
    }

    //对外提供获取对象实例方法
    public static Singleton getInstance(){
        return instance;
    }
}