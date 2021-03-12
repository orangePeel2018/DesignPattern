package com.structuralType.adapter.classAdapter;

//插头类，也就是适配器Adapter
public class Plug extends Volt220 implements Volt5{

    @Override
    public int output5V() {
        int volt = output220();
        int dst=volt/44;
        System.out.println("输出电压5V");
        return dst;
    }
}
