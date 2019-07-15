package com.stackroute.spring.domain;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Movie implements ApplicationContextAware, BeanFactoryAware, BeanNameAware {
    private String mname;
    private Actor aobj;
    private ApplicationContext context;
    public ApplicationContext getContext() {
        return context;
    }
    @Override
    public void setApplicationContext(ApplicationContext context)
            throws BeansException {
        this.context=context;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public Actor getAobj() {
        return aobj;
    }

    public void setAobj(Actor aobj){
        this.aobj=aobj;
    }
    public void displaydemo(){
        System.out.println("Details of Movie:" + mname);
        aobj.dispaly();
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println(beanFactory);
    }

    @Override
    public void setBeanName(String s) {
        System.out.println(s);

    }
}