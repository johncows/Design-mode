package com.kk.single;

/**
 * 懒汉式 静态内部类
 *
 * 优点: 内部类只有在被外部类去调用到他时才会加载
 *      随时需要,随时取值(仅一份)
 *      既兼顾了内存浪费问题,也解决了线程问题
 *      同样由classload提供线程安全保护
 *
 */
public class LazyInstance4 {

    private static boolean init = false;




    private LazyInstance4() {
        synchronized (LazyInstance4.class){
            if(init){
                init = !init;
                System.out.println(LazyInstance4.class.getName()+"创建成功 时间: "+System.currentTimeMillis());
            }else{
                throw new RuntimeException("嘟嘟 单例被侵犯");
            }
        }
        System.out.println(LazyInstance4.class.getName()+"创建成功 时间: "+System.currentTimeMillis());

    }

    // static 共享单例空间 final保证该方法不会被重写
    public static final LazyInstance4 getInstance(){
        return InstanceHolder.lazyInstance;
    }

    /**
     *  默认不会加载
     */
    private static class InstanceHolder{
       private static LazyInstance4 lazyInstance = new LazyInstance4();
    }


    public static void sayHEllo(){
        System.out.println("hello");
    }



}
