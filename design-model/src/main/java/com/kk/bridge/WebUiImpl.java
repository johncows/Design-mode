package com.kk.bridge;

/**
 * @author wangjunkang
 */
public  class WebUiImpl extends WebUi{

    public WebUiImpl(Calculator calculator) {
        super(calculator);
    }

    @Override
    public String displayResult(Integer a, Integer b) {
        return calculator.calculate(a,b)+"";
    }
}
