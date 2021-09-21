package com.kk.chain;

public class Clinet {

    public static void main(String[] args) {
        GroupLeader groupLeader = new GroupLeader();
        ScrumMaster scrumMaster = new ScrumMaster();
        CTO cto = new CTO();

        groupLeader.setManager(scrumMaster);
        scrumMaster.setManager(cto);

        System.out.println(groupLeader.leave(30, "王骏康"));
        

    }
}
