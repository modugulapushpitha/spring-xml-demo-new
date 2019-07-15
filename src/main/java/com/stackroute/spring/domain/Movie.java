package com.stackroute.spring.domain;

public class Movie {
    private String mname;
    private Actor aobj;

    public void setMname(String mname) {
        this.mname = mname;
    }

    public void setAobj(Actor aobj){
        this.aobj=aobj;
    }
    public void displaydemo(){
        System.out.println("Details of Movie:" + mname);
        aobj.dispaly();
    }
}
