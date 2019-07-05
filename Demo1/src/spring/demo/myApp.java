package spring.demo;

public class myApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coach baseball = new BaseballCoach();
		System.out.println(baseball.getDailyWorkOut());
		
		Coach trackMe = new TrackCoach();
		System.out.println(trackMe.getDailyWorkOut());
	}

}
