package com.stackroute.spring.domain;

public class Actor {
    private String name;
    private int age;
    private String gender;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
   /*public Actor(String name,int age,String gender){
       this.name=name;
       this.age=age;
       this.gender=gender;
   }*/
   public void initBean() {
       System.out.println("Init Bean for : Actor");
   }

    public void destroyBean() {
        System.out.println("Destroy Bean for : Actor");
    }
    public void dispaly(){

        System.out.println("Actor details:" + "\n"+  "Name:" + name + "\n" + "Age:" + " " + age +"\n" + "Gender:" +  gender);
    }
}
