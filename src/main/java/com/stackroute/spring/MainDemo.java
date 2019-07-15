package com.stackroute.spring;

import com.stackroute.spring.demo.BeanLifeCycleDemoBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainDemo {
    public  static  void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beandemo.xml");
        BeanLifeCycleDemoBean demo = context.getBean("lcobj",BeanLifeCycleDemoBean.class);
        //demo.Init();
        //demo.afterPropertiesSet();
        demo.clean();
        demo.destroy();
    }
}
