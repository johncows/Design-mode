package com.kk.obsever;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class Eventlistener {

    private Map<Enum,Event> events = new HashMap<>();

    public void addListener(Enum eventType, Object target, Method callback){
        Event event = new Event(target, callback);
        events.put(eventType,event);
    }


    protected void trigger(Enum eventType){
        if(!this.events.containsKey(eventType))
            return;
        trigger(events.get(eventType).setTrigger(eventType.toString()));
    }

    private void trigger(Event event){
        event.setEventSource(this);
        event.setTime(System.currentTimeMillis()+"");
        try {
            event.getCallback().invoke(event.getTargetObj(),null);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }



}
