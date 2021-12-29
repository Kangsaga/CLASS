
public class WheelMouse extends Mouse {
	public void scllor() {
		System.out.println("드르륵");
	}
	
	// 오버라이딩 -> 상속관계에서 자식클래스가
	// 부모클래스의 기능을 재정의 할때 사용한다!!
	@Override
	public void Click() {
		System.out.println("클릭 클릭");
	}
}
