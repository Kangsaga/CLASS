package Exam03;

public class 물자동차 extends 자동차{

	// 개발시에 강제성을 부여하고 싶을때 
	// 추상클래스 추상메소드를 사용한다!!
	
	
	@Override
	public void charge() {
			System.out.println("물 연료를 충전하다 ");
	}

	@Override
	public void run() {
		System.out.println("물로 자동차를 달리다");
	}
	
	
	
	
	
	
}
