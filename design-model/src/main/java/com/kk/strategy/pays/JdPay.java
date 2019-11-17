package com.kk.strategy.pays;

import com.kk.strategy.Order;
import com.kk.strategy.PayStatus;

public class JdPay implements Pay {
    @Override
    public PayStatus pay(Order order) {
        System.out.println("----------------------------");
        System.out.println("正在调用 京东白条支付接口 请稍后");
        System.out.println("价格为"+order.getPrice()+",支付成功 请耐心等待收货");
        PayStatus payStatus = new PayStatus();
        payStatus.setMsg("支付成功");
        payStatus.setStatus("OK");
        System.out.println("----------------------------");
        return payStatus;
    }
}
