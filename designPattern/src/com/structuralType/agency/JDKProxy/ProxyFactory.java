package com.structuralType.agency.JDKProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {

    private TeachDao teachDao;

    public ProxyFactory(TeachDao teachDao) {
        this.teachDao = teachDao;
    }

    //给目标对象 生成一个代理对象
    public Object getProxyInstance(){
        //说明
		/*
		 *  public static Object newProxyInstance(ClassLoader loader,
                                          Class<?>[] interfaces,
                                          InvocationHandler h)

            //1. ClassLoader loader ： 指定当前目标对象使用的类加载器, 获取加载器的方法固定
            //2. Class<?>[] interfaces: 目标对象实现的接口类型，使用泛型方法确认类型
            //3. InvocationHandler h : 事情处理，执行目标对象的方法时，会触发事情处理器方法, 会把当前执行的目标对象方法作为参数传入
		 */
       return Proxy.newProxyInstance(teachDao.getClass().getClassLoader(), teachDao.getClass().getInterfaces(),
               new InvocationHandler() {
                   @Override
                   public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
                       Object invoke = method.invoke(teachDao, objects);
                       return invoke;
                   }
               }
       );
    }
}
