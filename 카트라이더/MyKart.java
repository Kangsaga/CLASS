package Exam02;

public class MyKart implements Kart{
	
	// 인터페이스에서 상속 받은 추상메소드는 반드시 구현 해주어야함!
	
	int myposition = position; // MyKart 가 생성되면
	// 무조건 myposition 은 0이다(시작위치)
	
	
	@Override
	public void go(int num) {
		myposition += num;
	}

	@Override
	public void back(int num) {
		myposition -= num;
	}

	@Override
	public void booster(int power) {
		myposition += power;
	}
	
	
	
	
}
