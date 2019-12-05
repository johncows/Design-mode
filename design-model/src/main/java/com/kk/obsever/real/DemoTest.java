package com.kk.obsever.real;

import com.kk.obsever.Event;

public class DemoTest {

    public static void main(String[] args) throws NoSuchMethodException {

        Observer observer = new Observer();


        Subject subject = new Subject();

        subject.addListener(SubjectEventType.ADD,observer,Observer.class.getMethod("add",null));


        subject.add();




    }
}
