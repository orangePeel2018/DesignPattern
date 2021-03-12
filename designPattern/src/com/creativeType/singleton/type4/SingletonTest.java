package com.creativeType.singleton.type4;

public class SingletonTest {
    public static void main(String[] args) {
        Singleton singleton= Singleton.getInstance();
        Singleton singleton2= Singleton.getInstance();
        System.out.println(singleton==singleton2);
        System.out.println("singleton的hashcode："+singleton.hashCode());
        System.out.println("singleton2的hashcode："+singleton2.hashCode());


    }
}

//懒汉式（线程安全,同步代码块）
class Singleton{
    //私有构造方法
    private Singleton(){

    }
    //创建空对象
    private static Singleton instance=null;


    //对外提供获取对象实例方法,使用同步代码块方法,保证线程安全,调用该方法时，对象才会进行创建
    public static  Singleton getInstance(){
        if(instance==null) {
            synchronized (Singleton.class) {
                instance = new Singleton();
            }
        }
        return instance;
    }
}