package com.creativeType.singleton.type7;

public class SingletonTest {
    public static void main(String[] args) {
        Singleton singleton= Singleton.getInstance();
        Singleton singleton2= Singleton.getInstance();
        System.out.println(singleton==singleton2);
        System.out.println("singleton的hashcode："+singleton.hashCode());
        System.out.println("singleton2的hashcode："+singleton2.hashCode());


    }
}

//静态内部类
class Singleton{
    //私有构造方法
    private Singleton(){

    }
    //静态内部类
    public static class SingletonInfo{
        private static final Singleton instance=new Singleton();
    }

    //对外提供获取对象实例方法,调用静态内部类得到对象
    public static Singleton getInstance() {
        return SingletonInfo.instance;
    }
}