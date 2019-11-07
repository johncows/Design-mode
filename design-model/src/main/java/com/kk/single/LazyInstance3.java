package com.kk.single;

/**
 * 懒汉式 双重锁判定
 *
 * 优点: 随时需要,随时创建(仅一份),具备线程安全,且在实例被创建后,每次获取都不会阻塞
 * 缺点: 不明确
 *
 */
public class LazyInstance3 {

    private static LazyInstance3 LAZY_INSTANCE = null;

    private LazyInstance3() {
        System.out.println(LazyInstance3.class.getName()+"创建成功 时间: "+System.currentTimeMillis());
    }

    public static  LazyInstance3 getInstance(){
        Object LOCK = new Object();
        if (LAZY_INSTANCE == null) {
           synchronized (LOCK){
               if (LAZY_INSTANCE == null) {
                   LAZY_INSTANCE = new LazyInstance3();
               }
           }
        }
        return LAZY_INSTANCE;
    }

}
