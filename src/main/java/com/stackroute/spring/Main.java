package com.stackroute.spring;

import com.stackroute.spring.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class Main {
    public static void main(String[] args) {
        ApplicationContext obj = new ClassPathXmlApplicationContext("bean.xml");
        BeanFactory obj2=new ClassPathXmlApplicationContext("bean.xml");

        Movie ac= obj.getBean("mobj", Movie.class);
        ac.displaydemo();

        Movie mbf= obj.getBean("mobj", Movie.class);
        mbf.displaydemo();

        BeanDefinitionRegistry bnfobj=new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(bnfobj);
        reader.loadBeanDefinitions(new FileSystemResource("/home/pushpitha/springexe/src/main/resources/beans.xml"));
        Movie mbfobj=((DefaultListableBeanFactory)bnfobj).getBean(Movie.class);
        mbfobj.displaydemo();

    }
}
