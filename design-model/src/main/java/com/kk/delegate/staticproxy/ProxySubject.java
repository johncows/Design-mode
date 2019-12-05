package com.kk.delegate.staticproxy;

import java.util.Date;

public class ProxySubject implements Task {

    private Task task;

    public ProxySubject(Task task) {
        this.task = task;
    }

    @Override
    public void dealTask() {
        System.out.println("开始时间 "+new Date());
        task.dealTask();
        System.out.println("结束时间 "+new Date());
    }
}
