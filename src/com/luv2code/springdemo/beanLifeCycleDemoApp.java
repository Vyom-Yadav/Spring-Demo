package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class beanLifeCycleDemoApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext config =
                new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");

        Coach theCoach = config.getBean("myCoach", Coach.class);
        Coach secCoach = config.getBean("myCoach", Coach.class);

        System.out.println(theCoach.getDailyFortune());
        System.out.println(secCoach.getDailyFortune());
        config.close();

    }
}
