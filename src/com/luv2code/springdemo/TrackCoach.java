package com.luv2code.springdemo;

import org.springframework.beans.factory.DisposableBean;

public class TrackCoach implements Coach, DisposableBean {

    private FortuneService fortuneService;

    public TrackCoach(FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run for 30 minutes";
    }

    @Override
    public String getDailyFortune() {
        return "Just do it " + fortuneService.getFortune();
    }

    // add an init method
    public void doMyStartupStuff() {
        System.out.println("Track Coach: inside method doMyStartupStuff");
    }

    // add an destroy method
    public void doMyCleanupStuffYoYo() {
        System.out.println("Track Coach: inside method doMyCleanupStuffYoYo");
    }


    @Override
    public void destroy() throws Exception {
        System.out.println("Track Coach: inside method destroy");
    }
}
