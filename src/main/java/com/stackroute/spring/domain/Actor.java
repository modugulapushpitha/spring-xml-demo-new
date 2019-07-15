package com.stackroute.spring.domain;

public class Actor {
    private String name;
    private int age;
    private String gender;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public void dispaly(){

        System.out.println("Actor details:" + "\n"+  "Name:" + name + "\n" + "Age:" + " " + age +"\n" + "Gender:" +  gender);
    }
}
