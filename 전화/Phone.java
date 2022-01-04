
public interface Phone {
	
	// 인터페이스의 변수는 상수(고정된 값)만 올수있다 -> 변경 불가능
	// final 은 생략 가능하다
	
	// 버튼
	int button = 12;
	// 스피커
	int speak = 4;
	// 마이크
	final int mic = 2;
	
	
	// 사진찍기
	public abstract void Carmera();
	// 통화기능
	public abstract void Call();
	
	// 인터페이스에서 일반메소드는 만들수 없다
	// 무조건 추상 메소드로 인식하기때문에 
	// public abstract는  생략가능하다
	void Message(); // defalut abstract
	
	
	
	
}
