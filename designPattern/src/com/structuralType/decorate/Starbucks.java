package com.structuralType.decorate;

public class Starbucks {
    public static void main(String[] args) {
        //先点一杯咖啡
        CivetCoffee civetCoffee=new CivetCoffee();
        System.out.println(civetCoffee.getDes()+"---"+civetCoffee.cost());
        //加牛奶
        Milk milk=new Milk(civetCoffee);
        System.out.println(civetCoffee.getDes()+"---"+milk.cost());
        //加糖
        Sugar sugar=new Sugar(civetCoffee);
        System.out.println(civetCoffee.getDes()+"---"+sugar.getDes()+"---"+sugar.cost());
    }
}
