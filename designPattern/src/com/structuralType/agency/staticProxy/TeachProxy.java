package com.structuralType.agency.staticProxy;

public class TeachProxy implements ITeachDao {

    private TeachDao teachDao;

    public TeachProxy(TeachDao teachDao){
        this.teachDao=teachDao;
    }

    @Override
    public void teach() {
        teachDao.teach();
    }
}
