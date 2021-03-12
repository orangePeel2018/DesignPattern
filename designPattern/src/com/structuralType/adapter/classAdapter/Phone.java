package com.structuralType.adapter.classAdapter;

//手机充电，需要5v的电压
public class Phone{

    public void charge(Volt5 volt5){
        int i = volt5.output5V();
        if(i==5) {
            System.out.println(i + "伏电流正在为手机充电");
        }else {
            System.out.println("危险！电压过大");
        }
    }
}
