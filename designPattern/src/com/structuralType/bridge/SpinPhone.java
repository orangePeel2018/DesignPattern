package com.structuralType.bridge;

public class SpinPhone extends Phone {

    public SpinPhone(Brand brand) {
        super(brand);
    }

    public void open(){
        super.open();
        System.out.println("折叠样式手机");
    }
    public void close(){
        super.close();
        System.out.println("折叠样式手机");
    }
    public void call(){
        super.call();
        System.out.println("折叠样式手机");
    }
}
