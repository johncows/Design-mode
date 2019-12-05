package com.kk.delegate.cglibs;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class ProxyClass implements MethodInterceptor {


    /**
     * o：cglib生成的代理对象
     * method：被代理对象方法
     * objects：方法入参
     * methodProxy: 代理方法
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("前置通知");
        Object result = methodProxy.invokeSuper(o, objects);
        System.out.println("后置通知");
        return result;
    }
}
