package com.kk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignModelApplication {

    public static void main(String[] args) {
        SpringApplication.run(DesignModelApplication.class, args);
    }








}


// 目标接口适配器,实现了需求接口,但使用的是目标接口方法
class TargetAdapter implements Need{

    private Target target;

    @Override
    public void say() {
        target.speck();
    }
}





//需求的接口
interface Need{
    void say();
}

//需求接口实现类
class NeedImpl implements  Need{
    @Override
    public void say() {
        // 调用原有接口提供的方法
    }
}



//原有接口
interface Target{
    void  speck();
}


//原有接口实现类
class TargetImpl implements  Target{
    @Override
    public void speck() {
        System.out.println("原先默认");
    }
}

