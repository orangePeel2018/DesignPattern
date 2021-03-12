package com.behaviorType.MemoMode;

public class GameRole {
    private int vit;
    private int def;

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }
    //保存到备忘录
    public Memento getMemento(){
        return new Memento(vit,def);
    }
    //返回备忘录状态
    public void getInfoFromMemento(Memento memento){
        this.vit=memento.getVit();
        this.def=memento.getDef();
    }

    //显示状态
    public void display(){
        System.out.println("游戏角色当前的攻击力：" + this.vit + " 防御力: " + this.def);
    }
}
