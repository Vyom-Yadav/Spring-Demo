package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
    public static void main(String[] args) {
        // load the spring config file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");


        // retrieve bean from spring container
        Coach theCoach = context.getBean("myBaseballCoach", Coach.class);
        Coach theCoach2 = context.getBean("myTrackCoach", Coach.class);

        // call methods on the bean
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());
        System.out.println(theCoach2.getDailyWorkout());
        System.out.println(theCoach2.getDailyFortune());

        // close the context
        context.close();
    }
}
