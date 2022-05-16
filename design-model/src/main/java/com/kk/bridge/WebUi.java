package com.kk.bridge;

/**
 * @author wangjunkang
 */
public abstract class WebUi {
    protected Calculator calculator;

    public WebUi(Calculator calculator) {
        this.calculator = calculator;
    }

    public abstract String displayResult(Integer a,Integer b);
}
