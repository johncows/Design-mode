package com.kk.decorate;

import org.junit.Test;




public class DecorateTest {


     @Test
     public void fun1(){
         Component target = new Target();
         target.operation();
     }


      @Test
      public  void fun2(){
          Component target = new Target();
          Component decorate = new Decorate(target);
//        decorate.operation();
          new  Decorate(decorate).operation();
      }


}
