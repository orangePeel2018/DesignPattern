package com.behaviorType.templatePattern;

public class PureSoyMilk extends SoyMilk {
    //不需要加料时，默认空实现
    @Override
    void add() {

    }

    //不需要加料，需要重写钩子方法

    @Override
    boolean whetherAdd() {
        return false;
    }
}
