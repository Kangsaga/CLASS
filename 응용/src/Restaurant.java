
// Restaurant 클래스의 필드와 생성자는 수정할 필요 없음
public class Restaurant extends Store {

	double service;
	double flavor;
	double clean;

	public Restaurant(String name, String event, double price, double service, double flavor, double clean) {
		this.name = name;
		this.event = event;
		this.price = price;
		this.service = service;
		this.flavor = flavor;
		this.clean = clean;
	}

	@Override
	public double grade() {
		// 여기에 서비스, 맛, 청결, 가격 점수의 평균을 출력할 기능을 작성하시오 
		// (소수점 2자리 수 까지만 출력)
		int result = 0;
		result = (int)(price + service + flavor + clean) / 4 *100;
		int a = result / 100;
		
		return a;
	}

}
