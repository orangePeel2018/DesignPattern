package com.principle.inversion.three;

public class DependencyPass {
    public static void main(String[] args) {
        OpenAndClose openAndClose=new OpenAndClose();
        openAndClose.setTv(new ChangHong());
        openAndClose.open();
    }
}
//打开与关闭的抽象
interface IOpenAndClose{
    public void open();
    public void setTv(ITV itv);
}
//电视机的抽象
interface ITV{
    public void play();


}
//电视机的实现
class ChangHong implements ITV{

    @Override
    public void play() {
        System.out.println("长虹电视打开");
    }
}
//打开与关闭的实现
class OpenAndClose implements IOpenAndClose{

    private ITV itv;

    @Override
    public void open() {
        this.itv.play();
    }

    @Override
    public void setTv(ITV itv) {
        this.itv=itv;
    }
}