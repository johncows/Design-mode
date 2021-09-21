package com.kk.chain;

import lombok.Data;

@Data
public class ScrumMaster extends Manager {

    private Manager manager;

    @Override
    String leave(int day, String name) {
        if(day<=10 && day>5){
           return "ScrumMaster 批准了"+name+"的"+day+ "天假期";
        }
        return manager.leave(day,name);
    }
}
