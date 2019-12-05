package com.kk.delegate.dynamic;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Date;

/**
 *  动态代理类(代理任何对象)
 *  必须实现InvocationHandler接口
 */
public class DynamicProxy implements InvocationHandler {

    //被代理类()
    private Object targetObj;

    // 注入对象
    public DynamicProxy(Object targetObj) {
        this.targetObj = targetObj;
    }


    /**
     *
     *  proxy   代理对象
     *  method  代理对象调用的方法
     *  args    调用的方法中的参数
     *
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println(proxy.getClass().getName());
        System.out.println("开始时间 "+new Date());

        //执行目标方法
        Object invoke = method.invoke(targetObj, args);

        System.out.println("结束时间 "+new Date());
        return invoke;
    }
}
