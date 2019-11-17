package com.kk.strategy;

import com.kk.strategy.pays.AliPay;
import com.kk.strategy.pays.JdPay;
import com.kk.strategy.pays.JiaLiPay;
import com.kk.strategy.pays.Pay;

public enum  PayType {
    ALIPAY(new AliPay()),JDPAY(new JdPay()),JIALIPAY(new JiaLiPay())
    ;

    private Pay pay;

    PayType(Pay pay) {
        this.pay = pay;
    }

    Pay getPay(){
        return this.pay;
    }

}
