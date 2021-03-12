package com.uml.Dependence;

public class PersonServiceBean {
    private PersonDao personDao;//依赖
    public void save(Person person){//依赖

    }
    public IDCard getIDCard(){//依赖
        return null;
    }
    public void modify(){
        Department department=new Department();//依赖
    }
}
