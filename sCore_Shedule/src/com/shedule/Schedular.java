package com.shedule;

import org.springframework.scheduling.annotation.Scheduled;

public class Schedular {
	//@Scheduled(fixedDelay = 1000)	//First output shown then delay starts (1st Hello Debojyoti shown then 2s pause then Hello Debojyoti again)
	//@Scheduled(cron = "*/2 * * * * *") //Second, Minute, Hour, Day_of_month, Month , Day_of_week denotes every star from L to R.
	//For this first delay starts then output shown (2s pause then Hello Debojyoti)
	@Scheduled(fixedRate = 2000)	//First output shown then delay starts (1st Hello Debojyoti shown then 2s pause then Hello Debojyoti again)
	public void performSomething() {
		System.out.println("Hello Debojyoti");
	}
}