package com.kk.strategy.pays;

import com.kk.strategy.Order;
import com.kk.strategy.PayStatus;

public interface Pay {
    PayStatus pay(Order order);
}
