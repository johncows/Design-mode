package com.kk.chain;

import lombok.Data;

@Data
public class GroupLeader extends Manager{

    private Manager manager;

    @Override
    String leave(int day, String name) {
        if(day<=5 && day>1){
            return "GroupLeader 批准了"+name+"的"+day+ "天假期";
        }
        return manager.leave(day,name);
    }
}
