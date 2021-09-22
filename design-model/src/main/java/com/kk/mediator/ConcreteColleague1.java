package com.kk.mediator;

public class ConcreteColleague1 extends Colleague{

    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }

    public void send(String message){
        /**
         * 发送消息给中介者，交给中介者做调度
         */
        mediator.send(message,this);
    }

    public void notify(String message){
        System.out.println("同事1收到了消息 内容是"+message);
    }
}
