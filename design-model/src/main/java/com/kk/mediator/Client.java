package com.kk.mediator;

public class Client {

    /**
     *
     */
    public static void main(String[] args) {
        // 构造中介者
        ConcreteMediator concreteMediator = new ConcreteMediator();

        // 创建 同事1，并把中介者介绍给同事2
        ConcreteColleague1 concreteColleague1 = new ConcreteColleague1(concreteMediator);
        // 创建 同事2，并把中介者介绍给同事1
        ConcreteColleague2 concreteColleague2 = new ConcreteColleague2(concreteMediator);

        // 把同事1，同事2 介绍给中介者
        concreteMediator.setConcreteColleague1(concreteColleague1);
        concreteMediator.setConcreteColleague2(concreteColleague2);

        // 可以发现同事1 和 同事2 不产生耦合
        // 同事1发送消息后，同事2收到了消息做出响应
        concreteColleague1.send("早上吃过没？");

        // 同事2发送消息后，同事1收到了消息做出响应
        concreteColleague2.send("还没吃呢，你请我？");
    }

}
