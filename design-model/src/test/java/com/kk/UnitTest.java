package com.kk;

import com.kk.propertype.People;
import com.kk.single.*;
import com.sun.org.apache.bcel.internal.generic.LADD;
import org.junit.jupiter.api.Test;
import org.springframework.util.StopWatch;
import sun.reflect.Reflection;

import java.io.*;
import java.util.Date;
import java.util.concurrent.CountDownLatch;

public class UnitTest {

    int count = 2000;


    @Test
    void safeTest() throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(count); //计数器,count为100
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        for(int i=0 ;i<count ;i++){
            Thread thread = new Thread(() -> {
                try {
                    countDownLatch.await();//通过countDown来对count进行减操作,count不为0时阻塞
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                LazyInstance2 instance = LazyInstance2.getInstance();//通过伪造并发情况,同时获取实例对象
            });
            thread.start();
            countDownLatch.countDown();//对count进行减操作
        }
        Thread.sleep(100000);
    }

    @Test
    void avoidReflection() throws Exception {
        HungryInstance instance1 = HungryInstance.getInstance();

        FileOutputStream fileOutputStream = new FileOutputStream("instance.obj");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(instance1);

        objectOutputStream.close();
        fileOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("instance.obj");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        HungryInstance instance2 = (HungryInstance) objectInputStream.readObject();
        System.out.println(instance1 == instance2);

    }


    @Test
    public void fun2(){
        EnumInstance instance = EnumInstance.INSTANCE;
         instance = EnumInstance.INSTANCE;
         instance = EnumInstance.INSTANCE;

    }


    @Test
    public void fun3() throws CloneNotSupportedException {
        People people1 = new People(1, 2, new Date(),"大众",123);
        People people2 = (People) people1.clone();
        System.out.println(people2);
        people1.getBirthday().setTime(System.currentTimeMillis());
        System.out.println(people2);
    }





}
