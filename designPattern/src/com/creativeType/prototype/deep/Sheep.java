package com.creativeType.prototype.deep;


import java.io.*;

public class Sheep implements  Cloneable, Serializable {

    private String name;
    private int age;
    private Wool wool;

    public Sheep() {
    }

    public Sheep(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Wool getWool() {
        return wool;
    }

    public void setWool(Wool wool) {
        this.wool = wool;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", wool=" + wool +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Sheep sheep=null;
        sheep= (Sheep) super.clone();
        sheep.setWool((Wool) wool.clone());
        return sheep;

    }

    protected Object deepClone() {
        //创建流对象
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;

        try {
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            Sheep sheep = (Sheep) ois.readObject();
            return sheep;

        } catch (Exception e) {
           return  e.getMessage();
        } finally {
            try {
                bos.close();
                bis.close();
                oos.close();
                ois.close();
            } catch (Exception e) {
                return e.getMessage();
            }
        }
    }
}
