package Exam01;

public class AnimalMain {

	public static void main(String[] args) {
		
		Animal ani = new Animal();
		
		System.out.println("발톱 갯수 : " + ani.claw);
		System.out.println("꼬리 길이 : " + ani.tailSize);
		System.out.println("무늬 : " + ani.pattern);
		System.out.println("이빨 갯수 : " + ani.teeth);
		
		// 오버라이딩을 통해서 무늬를 바꿈
		Dog dog = new Dog();
		dog.pattern = "줄무늬";
		
		//업캐스팅을 함
		Animal ani2 = dog;
		System.out.println(ani2.pattern);
		
		// 업캐스팅을 했기 때문에 부모에 있는 기능을
		// 부모가 오버라이딩을 해도 바뀐다
		// 같은 주소값을 가지기 때문에
		ani2.pattern = "별모양";
		System.out.println(dog.pattern);
		
	}

}
