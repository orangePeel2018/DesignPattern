package com.structuralType.adapter.objectAdapter;

//插头类，也就是适配器Adapter
public class Plug implements Volt5 {
    private Volt220 volt220;//通过组合方式

    public Volt220 getVolt220() {
        return volt220;
    }

    public void setVolt220(Volt220 volt220) {
        this.volt220 = volt220;
    }

    public Plug(Volt220 volt220){
        this.volt220=volt220;
    }

    @Override
    public int output5V() {
        int volt = volt220.output220();
        int dst=volt/44;
        System.out.println("输出电压5V");
        return dst;
    }
}
