package com.kk.decorate;

public class Decorate implements Component{

    private Component component;

    public Decorate(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        System.out.println("Create The worker");
        component.operation();
        System.out.println("i am broken");
    }
}
