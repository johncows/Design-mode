package com.kk.obsever;

import java.lang.reflect.Method;

public class Event {

    //时间源
    private Object eventSource;

    //目标类
    private Object targetObj;

    //回调方法
    private Method callback;

    //触发
    private String trigger;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    //触发时间
    private String time;

    @Override
    public String toString() {
        return "Event{" +
                "eventSource=" + eventSource +
                ", targetObj=" + targetObj +
                ", callback=" + callback +
                ", trigger='" + trigger + '\'' +
                ", time='" + time + '\'' +
                '}';
    }

    public Object getEventSource() {
        return eventSource;
    }

    public Event(Object targetObj, Method callback) {
        this.targetObj = targetObj;
        this.callback = callback;
    }

    public void setEventSource(Object eventSource) {
        this.eventSource = eventSource;
    }

    public Object getTargetObj() {
        return targetObj;
    }

    public void setTargetObj(Object targetObj) {
        this.targetObj = targetObj;
    }

    public Method getCallback() {
        return callback;
    }

    public void setCallback(Method callback) {
        this.callback = callback;
    }

    public String getTrigger() {
        return trigger;
    }

    public Event setTrigger(String trigger) {
        this.trigger = trigger;
        return this;
    }
}
