package com.kk.single;

import java.io.Serializable;
import java.util.Date;


/**
 * 经典饿汉式
 *  优点: 在类加载时就创建了实例,由于classLoader自带线程安全
 *  缺点: 涉及到性能考虑,比如有时候暂时不需要该实例,仅仅调用该类的其他方法,此时实例就被创建
 *
 *  线程安全,由于性能,很少使用
 */
public class HungryInstance implements Serializable {

    private static final HungryInstance HUNGRY_INSTANCE = new HungryInstance();

    private HungryInstance() {
        System.out.println(this.getClass().getName()+"已被初始化,初始化数据为"+new Date());
    }


    public static HungryInstance getInstance(){
        System.out.println(HUNGRY_INSTANCE+"----------"+System.currentTimeMillis());
        return HUNGRY_INSTANCE;
    }


    /**
     *  该方法为jvm定义的,如果不实现该方法,通过序列化所获得的对象就是另一份copy的对象
     */
    public Object readResolve(){
        return HUNGRY_INSTANCE;
    }
}
