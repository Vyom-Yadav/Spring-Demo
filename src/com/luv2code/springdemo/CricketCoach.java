package com.luv2code.springdemo;

public class CricketCoach implements Coach {

    private FortuneService fortuneService;

    @Override
    public String getDailyWorkout() {
        return "Hit 10 sixes.";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    // no arg const
    public CricketCoach() {
        System.out.println("Cricket Coach: inside no arg const");
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("Cricket Coach: inside setter method");
        this.fortuneService = fortuneService;
    }
}
