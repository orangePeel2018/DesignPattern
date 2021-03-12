package com.principle.inversion.improve;

public class DependencyInversion {
    public static void main(String[] args) {
        Person person=new Person();
        person.receive(new Email());
        person.receive(new Qq());
    }
}
interface Send{
    public void getInfo();
}


class Email implements Send{

    @Override
    public void getInfo() {
        System.out.println("发送邮件");
    }
}

class Qq implements Send{

    @Override
    public void getInfo() {
        System.out.println("发送qq消息");
    }
}

class Person{
    public void receive(Send send){
        send.getInfo();
    }
}