package com.creativeType.singleton.type8;

public class Singleton {

    public static void main(String[] args) {
        SingletonEnum instance=SingletonEnum.INSTANCE;
        SingletonEnum instance2=SingletonEnum.INSTANCE;

        System.out.println(instance.hashCode());
        System.out.println(instance2.hashCode());
        instance.test();
        instance2.test();
    }
}
enum SingletonEnum {
    INSTANCE;
    public void test(){
        System.out.println("嘟嘟嘟");
    }

}
