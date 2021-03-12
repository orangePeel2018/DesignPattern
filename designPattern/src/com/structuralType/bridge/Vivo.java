package com.structuralType.bridge;

public class Vivo implements Brand {
    @Override
    public void open() {
        System.out.println("小米打开");
    }

    @Override
    public void close() {
        System.out.println("小米关闭");
    }

    @Override
    public void call() {
        System.out.println("小米打电话");
    }
}
