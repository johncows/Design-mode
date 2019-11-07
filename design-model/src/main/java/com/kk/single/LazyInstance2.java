package com.kk.single;

/**
 * 懒汉式改良
 *
 * 优点: 随时需要,随时创建(仅一份),具备线程安全
 * 缺点: 由于使用了类级别锁,当有多线程同时取值时,会阻塞(无论实例是否被创建)
 *
 */
public class LazyInstance2 {

    private static LazyInstance2 LAZY_INSTANCE_1 = null;

    private LazyInstance2() {
        System.out.println(LazyInstance2.class.getName()+"创建成功 时间: "+System.currentTimeMillis());
    }

    public static synchronized LazyInstance2 getInstance(){
        if (LAZY_INSTANCE_1 == null) {
            LAZY_INSTANCE_1 = new LazyInstance2();
        }
        return LAZY_INSTANCE_1;
    }

}
