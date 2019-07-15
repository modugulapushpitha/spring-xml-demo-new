package com.stackroute.spring;
import com.stackroute.spring.domain.Actor;
import com.stackroute.spring.demo.BeanLifeCycleDemoBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainDemo {
    public  static  void main(String[] args) {

        //ApplicationContext context = new ClassPathXmlApplicationContext("beandemo.xml");
        AbstractApplicationContext context= new ClassPathXmlApplicationContext("beandemo.xml");
        Actor bean=context.getBean("actor",Actor.class);
        bean.dispaly();
        context.close();

    }
}
