package com.stackroute.spring;

import com.stackroute.spring.domain.Movie;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext obj = new ClassPathXmlApplicationContext("bean.xml");
        Movie m1=obj.getBean("mobj1",Movie.class);
        m1.displaydemo();
        //Movie m2=obj.getBean("mobj2",Movie.class);
        //m2.displaydemo();

    }
}
