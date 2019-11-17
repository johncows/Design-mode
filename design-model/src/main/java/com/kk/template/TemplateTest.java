package com.kk.template;

import org.junit.Test;


/**
 *  demo测试是 模板方法模式
 *  具备以下特点:(与策略模式对比)
 *  1. 同样对某个具体流程的操作
 *  2. 区别
 *   . 策略模式讲究的是在服务端定义的有限个方法中选择某一个,参与到流程中
 *   . 模板方法则表明服务端将自定义的选择权交给了用户侧去自定义,流程不变
 *
 */
public class TemplateTest {

     @Test
     public  void fun(){
         JDBCTemplate jdbcTemplate = new JDBCTemplate();

         jdbcTemplate.analysisResultMap(()->{
             System.out.println("自定义参数");
         });

     }
}
