package com.kk.delegate.cglibs;

import org.junit.Test;
import org.springframework.cglib.proxy.Enhancer;

public class CglibTest {



     @Test
     public  void fun() throws NoSuchMethodException {
         Enhancer enhancer = new Enhancer();
         enhancer.setSuperclass(RealSubject.class);

         enhancer.setCallback(new ProxyClass());

         RealSubject o = (RealSubject) enhancer.create();
         o.speck();
         String let_go_to_die = o.write("let go to die");

     }



}
