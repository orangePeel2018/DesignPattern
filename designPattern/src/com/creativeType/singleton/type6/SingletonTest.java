package com.creativeType.singleton.type6;

public class SingletonTest {
    public static void main(String[] args) {
        Singleton singleton= Singleton.getInstance();
        Singleton singleton2= Singleton.getInstance();
        System.out.println(singleton==singleton2);
        System.out.println("singleton的hashcode："+singleton.hashCode());
        System.out.println("singleton2的hashcode："+singleton2.hashCode());


    }
}

//双重检查
class Singleton{
    //私有构造方法
    private Singleton(){

    }
    //创建空对象,要加上volatile,保证instance被修改时,立刻更新
    private static volatile Singleton instance=null;


    //对外提供获取对象实例方法,使用双重检查来保证线程安全,调用该方法时，对象才会进行创建
    public static Singleton getInstance(){
        if(instance==null) {
            synchronized (Singleton.class) {
                if (instance==null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}