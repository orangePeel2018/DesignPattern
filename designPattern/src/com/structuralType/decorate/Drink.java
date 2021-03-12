package com.structuralType.decorate;

public abstract class Drink {

    private String des;
    private Double price;

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public abstract double cost();
}
