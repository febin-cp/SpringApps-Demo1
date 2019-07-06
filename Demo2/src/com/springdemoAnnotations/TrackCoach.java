package com.springdemoAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("SillyCoach")
public class TrackCoach implements Coach {
	
	@Autowired
	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService theFortuneService) {
		// TODO Auto-generated constructor stub
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "Oh Bhai.. This is Work Out Page";
	}

	@Override
	public String getFortuneService() {
		// TODO Auto-generated method stub
		return "This is The shithole";
	}
	
	
}
