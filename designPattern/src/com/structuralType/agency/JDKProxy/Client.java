package com.structuralType.agency.JDKProxy;

public class Client {
    public static void main(String[] args) {
        TeachDao teachDao=new TeachDao();
        ProxyFactory proxyFactory=new ProxyFactory(teachDao);

        ITeachDao proxyInstance = (ITeachDao) proxyFactory.getProxyInstance();

        System.out.println(proxyInstance);
        proxyInstance.teach();
    }
}
