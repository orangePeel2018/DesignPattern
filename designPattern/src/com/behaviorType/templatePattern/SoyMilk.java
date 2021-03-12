package com.behaviorType.templatePattern;

public abstract class SoyMilk {

    //模板方法，定义执行该抽象类方法的模板
    //使用final修饰，阻止子类对他进行重写
    final void make(){
        select();
        if (whetherAdd()) {
            add();
        }
        soak();
        beat();
    }

    void select(){
        System.out.println("选择上等的黄豆");
    }
    //添加材料方法，需要子类实现
    abstract void add();

    void soak(){
        System.out.println("材料浸泡一段时间");
    }

    void beat(){
        System.out.println("开始打豆浆");
    }

    //钩子方法，用于判断是否需要加料,默认为true，子类可以重写覆盖方法
    boolean whetherAdd(){
        return true;
    }
}
