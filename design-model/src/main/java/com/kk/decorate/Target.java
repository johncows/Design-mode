package com.kk.decorate;

public class Target implements Component {
    @Override
    public void operation() {
        System.out.println("work work...");
    }
}
