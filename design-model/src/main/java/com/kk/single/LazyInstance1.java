package com.kk.single;

/**
 * 懒汉式原版
 *
 * 优点: 随时需要,随时创建(仅一份)
 * 缺点: 无线程安全 极易造成多实例现象
 *
 */
public class LazyInstance1 {

    private static LazyInstance1 LAZY_INSTANCE_1 = null;

    private LazyInstance1() {
        System.out.println(LazyInstance1.class.getName()+"创建成功 时间: "+System.currentTimeMillis());
    }

    public static LazyInstance1 getInstance(){
        if (LAZY_INSTANCE_1 == null) {
            LAZY_INSTANCE_1 = new LazyInstance1();
        }
        return LAZY_INSTANCE_1;
    }

}
