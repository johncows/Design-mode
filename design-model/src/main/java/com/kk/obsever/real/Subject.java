package com.kk.obsever.real;

import com.kk.obsever.Eventlistener;

public class Subject extends Eventlistener {

    public void add(){
        System.out.println("做出了添加动作");
        trigger(SubjectEventType.ADD);
    }


    public void delete(){
        System.out.println("做出了删除动作");
        trigger(SubjectEventType.DELETE);
    }



}
