package com.principle.dimier;

public class Demeter {
    public static void main(String[] args) {
        Ming ming=new Ming();
        ming.work();
    }
}
//ming需要找朋友jack完成工作，jack不会去求助自己的朋友mark，mark完成了
class Ming{

    public Jack getFriend(){//方法返回值，jack是直接朋友
        return new Jack();
    }

    public void work(){
       Jack jack=getFriend();
       jack.work();
    }
}

class Jack{
    public Mark getFriend(){
        return new Mark();
    }
    public void work(){
        Mark mark=getFriend();//局部变量，mark是间接朋友
        mark.work();
    }
}

class Mark{
    public void work(){
        System.out.println("做完");
    }
}