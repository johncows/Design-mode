package com.kk.bridge;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author wangjunkang
 */
public class Demo {
    public static void main(String[] args) {
        MinCalculator minCalculator = new MinCalculator();
        WebUiImpl webUi = new WebUiImpl(minCalculator);
        System.out.println(webUi.displayResult(10, 5));
    }
}
