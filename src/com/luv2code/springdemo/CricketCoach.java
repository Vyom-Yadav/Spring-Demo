package com.luv2code.springdemo;

public class CricketCoach implements Coach {

    private FortuneService fortuneService;
    private String team;
    private String email;

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

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
