package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class beanScopeDemoApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext config =
                new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        Coach theCoach = config.getBean("myCoach", Coach.class);
        Coach alphaCoach = config.getBean("myCoach", Coach.class);

        // check if they are same beans
        boolean result = theCoach.equals(alphaCoach);

        System.out.println(result);
        System.out.println("\nMemory location: "+theCoach);
        System.out.println("\nMemory location: "+alphaCoach);

        config.close();

    }
}
