package spring.demo;

public class CricketCoach implements Coach {
	
	private FortuneServices fortuneServices;
	
	 public CricketCoach() {
		// TODO Auto-generated constructor stub
		 System.out.println("You Are here in Cricket Coach");
	}
	
	 
	
	public void setFortuneServices(FortuneServices fortuneServices) {
		this.fortuneServices = fortuneServices;
	}



	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "Daily Bowl for 15 minutes";
	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return fortuneServices.getFortuneService();
	}

}
