package com.kk.strategy;

import com.kk.strategy.pays.Pay;
import org.junit.Test;

public class StrategyTest {


    private Order order = null;




    /**
     * @Description: 注意该方法的中调用pay方法,使用的就是策略模式
     * 即 用户侧选择需要的渠道,但不知道实现的细节且服务端不需要进行if else判断
     *      特点如下
     *      1.结果相同,即内部操作不同,对外一致
     *      2.用户侧选择 服务侧无法感知
     *      3.方法名固定,内部有变
     *      4.方法种类固定,限定选择范围
     *
     *      ----------------------------
     *      注意 该demo中枚举的使用
     *
     * @Param:
     * @return:
     * @Author: wjk
     * @Date: 2019/11/17
     */
     @Test
     public  void fun(){
         order = new Order();
         order.setId("爱吃蜂蜜的熊二");
         order.setPrice(120D);
         order.setProduct("加大码男士内裤");
         System.out.println("选择商品 "+ order.getProduct());
         System.out.println("确认下单");
         PayStatus pay = pay(PayType.ALIPAY.getPay());
         System.out.println(pay);
         System.out.println("等待物流配送 欢迎下次光临");
     }


     private PayStatus pay(Pay pay){
         return pay.pay(order);
     }


}
