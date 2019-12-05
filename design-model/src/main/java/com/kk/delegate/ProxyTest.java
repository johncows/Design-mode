package com.kk.delegate;

import com.kk.delegate.dynamic.DynamicProxy;
import com.kk.delegate.dynamic.MonitorTask;
import com.kk.delegate.dynamic.OtherTask;
import com.kk.delegate.dynamic.RealSubject;
import com.kk.delegate.staticproxy.ProxyFactory;
import com.kk.delegate.staticproxy.Task;
import com.sun.org.apache.xalan.internal.xsltc.compiler.util.ClassGenerator;
import org.junit.Test;
import sun.misc.ProxyGenerator;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class ProxyTest {


    /**
     *  静态代理类
     *  优点:
     *  1.业务类只需要关注业务逻辑本身，保证了业务类的重用性。(客户端面对的是代理类)
     *  2.业务类不直接面向用户
     *  缺点:
     *  1.代理对象的一个接口只服务于一种类型的对象，
     *    如果要代理的方法很多，势必要为每一种方法都进行代理，静态代理在程序规模稍大时就无法胜任了。
     *    也违反了开发封闭的原则
     *
     *  2.单个接口每增加一个方法,就必须在代理类和目标类增加新的方法
     *
     *  3.耦合度搞
     */
    @Test
    public  void testStatic(){
        Task proxyTask = ProxyFactory.getProxyTask();
        proxyTask.dealTask();
    }



     @Test
     public  void testDynamic1(){
         RealSubject realSubject = new RealSubject();
         InvocationHandler dynamicProxy = new DynamicProxy(realSubject);

         /**
          *  loader      自然是类加载器
          *  interfaces  代码要用来代理的接口
          *  h 一个 InvocationHandler 对象
          */
         com.kk.delegate.dynamic.Task o
                 =(com.kk.delegate.dynamic.Task) Proxy.newProxyInstance(this.getClass().getClassLoader(), RealSubject.class.getInterfaces(), dynamicProxy);
         o.dealTask();
     }



    @Test
    public  void testDynamic2(){
        MonitorTask monitorTask = new MonitorTask();
        InvocationHandler dynamicProxy = new DynamicProxy(monitorTask);
        OtherTask otherTask = (OtherTask)Proxy.newProxyInstance(this.getClass().getClassLoader(), monitorTask.getClass().getInterfaces(), dynamicProxy);
        String monitor = otherTask.monitor("192.168.80.128", 3);
        System.out.println( monitor);
    }

     @Test
     public  void testDynamic3() throws IOException {
         MonitorTask monitorTask = new MonitorTask();
         InvocationHandler dynamicProxy = new DynamicProxy(monitorTask);

         OtherTask otherTask = (OtherTask) Proxy.newProxyInstance(this.getClass().getClassLoader(), monitorTask.getClass().getInterfaces(), dynamicProxy);

         Class<? extends OtherTask> aClass = otherTask.getClass();
         byte[] $Proxy4s = ProxyGenerator.generateProxyClass("$Proxy4", new Class[]{aClass});
         FileOutputStream fileOutputStream = new FileOutputStream("F:\\StudyDemo\\Design-mode\\design-model\\src\\main\\java\\com\\kk\\delegate\\a.class");
         fileOutputStream.write($Proxy4s);

         fileOutputStream.flush();
         fileOutputStream.close();

         System.out.println("aClass = " + aClass);


     }


}
