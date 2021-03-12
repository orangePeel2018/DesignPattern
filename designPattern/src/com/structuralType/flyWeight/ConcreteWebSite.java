package com.structuralType.flyWeight;

public class ConcreteWebSite extends WebSite {

    private String type="";

    public ConcreteWebSite(String type) {
        this.type = type;
    }

    @Override
    public void use(User user) {
        user.getName();
        System.out.println("网站发布形式为"+this.type+"当前使用者为"+user.getName());
    }
}
