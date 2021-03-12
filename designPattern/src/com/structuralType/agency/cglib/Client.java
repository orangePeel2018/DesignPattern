package com.structuralType.agency.cglib;

public class Client {
    public static void main(String[] args) {
        TeachDao teachDao=new TeachDao();
        ProxyFactory proxyFactory=new ProxyFactory(teachDao);
        TeachDao proxyInstance = (TeachDao) proxyFactory.getProxyInstance();
        proxyInstance.teach();
    }
}
