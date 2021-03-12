package com.behaviorType.templatePattern;

public class Client {
    public static void main(String[] args) {
        System.out.println("----------制作黑豆豆浆----------");
        SoyMilk blackBeanSoyMilk = new BlackBeanSoyMilk();
        blackBeanSoyMilk.make();

        System.out.println("----------制作红豆豆浆----------");
        SoyMilk redBeanSoyMilk = new RedBeanSoyMilk();
        redBeanSoyMilk.make();

        System.out.println("----------制作纯豆浆----------");
        SoyMilk pureSoyMilk = new PureSoyMilk();
        pureSoyMilk.make();
    }
}