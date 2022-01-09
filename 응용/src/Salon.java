// Salon 클래스의 필드와 생성자는 수정할 필요 없음
public class Salon extends Store {

	double technology;
	double kindness;

	public Salon(String name, String event, double price, double technology, double kindness) {
		this.name = name;
		this.event = event;
		this.price = price;
		this.technology = technology;
		this.kindness = kindness;
	}

	@Override
	public double grade() {
		// 여기에 기술, 친절, 가격, 점수의 평균을 출력하는 기능을 작성하시오
		// (소수점 2자리 수 까지만 출력)
		int result = 0;
		result = (int)(price + technology + kindness ) / 3 *100;
		int a = result / 100;
		
		return a;
	}

}
