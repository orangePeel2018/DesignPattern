package com.behaviorType.visitorPattern;

public class Client {
    public static void main(String[] args) {
        ObjectStructure objectStructure=new ObjectStructure();
        Man man = new Man();
        objectStructure.attach(man);
        objectStructure.display(new Success());

        objectStructure.detach(man);
        Women women=new Women();
        objectStructure.attach(women);
        objectStructure.display(new Fail());
    }
}
