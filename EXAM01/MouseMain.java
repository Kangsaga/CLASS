
public class MouseMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mouse mouse1 = new Mouse();
		mouse1.Click();
		mouse1.RightClick();
		
		WheelMouse mouse2 = new WheelMouse();
		mouse2.scllor(); //확장
		mouse2.Click(); //상속 + 오버라이딩
		mouse2.RightClick(); // 상속
		
		// 업캐스팅 -> 하위 클래스의 객체가
		// 상위 클래스의 객체 타입으로 형변환!!
		Mouse mouse3 = mouse2;
		mouse3.RightClick();
		// Mouse로 형변화을 시켰기 때문에
		// WheelMouse의 기능은 사용할수 없다
		// mouse3.scllor();
		
		// WheelMouse 에서 오버라이딩한 메소드는 바뀌지 않고 수행한다
		// WheelMouse 에 있는 기능와 Mouse에 기능에 교집합
		// 단,기능은 Wheelmouse에 기능을 사용한다
		mouse3.Click();
		
	}

}
