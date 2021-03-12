package com.creativeType.prototype.deep;

import java.io.Serializable;

public class Wool implements Cloneable, Serializable {
    private String color;

    public Wool() {
    }

    public Wool(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Wool{" +
                "color='" + color + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Wool wool= (Wool) super.clone();
        return wool;
    }
}
