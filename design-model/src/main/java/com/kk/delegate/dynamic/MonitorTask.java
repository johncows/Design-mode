package com.kk.delegate.dynamic;

public class MonitorTask implements OtherTask
{
    @Override
    public String monitor(String ipAddr, Integer times) {
        for(int i =0 ;i<times ;i++){
            System.out.println("检测ip端口 "+ ipAddr);
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return "the status is normal";
    }
}
