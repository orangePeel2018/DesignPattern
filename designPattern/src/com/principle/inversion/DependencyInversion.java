package com.principle.inversion;

public class DependencyInversion {
    public static void main(String[] args) {
        Person person=new Person();
        person.sendEmail(new Email());
    }
}

class Email{
    public void send(){
        System.out.println("发送邮件");
    }
}

class Person{
    public void sendEmail(Email email){
       email.send();
    }
}