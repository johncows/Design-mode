package com.kk.single;

/**
 * 懒汉式 静态内部类
 *
 * 优点: 随时需要,随时创建(仅一份),同样有classload提供线程安全保护
 * 缺点: 不明确
 *
 */
public class LazyInstance4 {

    private LazyInstance4() {
        System.out.println(LazyInstance4.class.getName()+"创建成功 时间: "+System.currentTimeMillis());
    }

    public static LazyInstance4 getInstance(){
        return InstanceHolder.lazyInstance;
    }

    private static class InstanceHolder{
       private static LazyInstance4 lazyInstance = new LazyInstance4();
    }


    public static void sayHEllo(){
        System.out.println("hello");
    }



}
