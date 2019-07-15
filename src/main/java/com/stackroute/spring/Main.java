package com.stackroute.spring;

import com.stackroute.spring.domain.Movie;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main {
    public static void main(String[] args) {
        ApplicationContext obj = new ClassPathXmlApplicationContext("bean.xml");
       // BeanFactory obj2=new ClassPathXmlApplicationContext("bean.xml");

        Movie ac1= obj.getBean("mobj1", Movie.class);
        //ac1.displaydemo();
        Movie ac2= obj.getBean("mobj1", Movie.class);
        //ac2.displaydemo();
        Movie ac3= obj.getBean("mobj2", Movie.class);
       // ac3.displaydemo();
        if(ac1==ac2)
            System.out.println(true);
        if(ac2==ac3)
            System.out.println(true);
        if(ac3==ac1)
            System.out.println(true);



    }
}
