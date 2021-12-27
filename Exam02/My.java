package Exam02;

public class My {
		
	// 꼬깔콘 먹는기능
	public void 꼬깔콘Open(꼬깔콘 snack) {
		snack.open();
	}
	// 홈런볼 먹는 기능
	public void 홈런볼Open(홈런볼 snack) {
		snack.open();
	}
	// 썬칩 먹는 기능
	public void 썬칩Open(썬칩 snack) {
		snack.open();
	}
	
	public void SnackOpen(Snack snack) {
		// snack 이라는 객체 하나로 서로 다른 기능을 할 수 있게끔 도와줌
		//---->다형성!!
		snack.open();
		// 업캐스팅이 된 상태에서 일시적으로 하위클래스의 있는
		// 기능을 수행하고 싶을때! -> 다운 캐스팅!!
		// 하위클래스명 다운캐스팅객체명 = (하위클래스명) 업캐스팅된객체명
		
		
		
		if (snack instanceof 썬칩) {
			// A instanceof B ->
			// A 라는 객체가 B로부터 업캐스팅된 객체라면 -> true 반환
			// 아니라면 false 반환
			
			// snack 라는 변수가 썬칩으로부터 
			// 업캐스팅된 변수라면
			// 다운캐스팅해주세요
			썬칩 ssunchip = (썬칩) snack;
			ssunchip.sorce();
		}
	}
}
