package com.creativeType.builder.bu;

//产品类
public class House {
    private String pile;
    private String wall;
    private String roof;

    public String getPile() {
        return pile;
    }

    public void setPile(String pile) {
        this.pile = pile;
    }

    public String getWall() {
        return wall;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    public String getRoof() {
        return roof;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }

    @Override
    public String toString() {
        return "House{" +
                "pile='" + pile + '\'' +
                ", wall='" + wall + '\'' +
                ", roof='" + roof + '\'' +
                '}';
    }
}
