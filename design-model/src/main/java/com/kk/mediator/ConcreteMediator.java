package com.kk.mediator;

public class ConcreteMediator extends Mediator {

    protected ConcreteColleague1 concreteColleague1;

    protected ConcreteColleague2 concreteColleague2;

    public void setConcreteColleague1(ConcreteColleague1 concreteColleague1) {
        this.concreteColleague1 = concreteColleague1;
    }

    public void setConcreteColleague2(ConcreteColleague2 concreteColleague2) {
        this.concreteColleague2 = concreteColleague2;
    }

    @Override
    public void send(String message, Colleague colleague) {
        if(colleague ==  concreteColleague1){
            concreteColleague2.notify(message);
        }else {
            concreteColleague1.notify(message);
        }
    }
}
