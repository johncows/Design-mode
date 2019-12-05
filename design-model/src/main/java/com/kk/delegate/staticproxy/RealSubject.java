package com.kk.delegate.staticproxy;

public class RealSubject implements Task {
    @Override
    public void dealTask() {
        System.out.println("开始执行任务-------------");
        try {
            Thread.sleep(5*1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("任务已结束--------------");
    }
}
