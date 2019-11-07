package com.kk.single;

/**
 *  枚举值单例
 *
 *  优点: 线程安全,仅此一份且可以防止序列与反序列化造成的实例变量不相等
 *
 *
 */
public enum  EnumInstance {

    INSTANCE;

    private  EnumInstance(){
        System.out.println("ENUMINSTANCE"+"----------"+System.currentTimeMillis());
    }

    public EnumInstance getInstance(){
        return INSTANCE;
    }



}
