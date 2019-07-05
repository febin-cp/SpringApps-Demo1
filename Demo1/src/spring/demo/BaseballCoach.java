package spring.demo;

public class BaseballCoach implements Coach {
	
	private FortuneServices fortuneServices;
	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "Work Hard Play Hard";
	}
	
	public BaseballCoach(FortuneServices theFortuneService) {
		// TODO Auto-generated constructor stub
		fortuneServices = theFortuneService;
	}
	
	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return fortuneServices.getFortuneService();
	}
	
}
