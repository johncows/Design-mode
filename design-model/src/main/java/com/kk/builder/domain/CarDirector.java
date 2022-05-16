package com.kk.builder.domain;

/**
 * @author wangjunkang
 */
public  class CarDirector {
    public  static Car construct(CarBuilder carBuilder){
        String chair = carBuilder.createChair();
        String wheel = carBuilder.createWheel();
        return new Car(wheel, chair);
    }
}
