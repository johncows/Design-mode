package com.kk.chain;

import lombok.Data;

@Data
public class CTO extends Manager {

    private Manager manager;

    @Override
    String leave(int day, String name) {
           return "CTO 批准了"+name+"的"+day+ "天假期";
    }
}
