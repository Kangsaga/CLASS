
// Restaurant Ŭ������ �ʵ�� �����ڴ� ������ �ʿ� ����
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
		// ���⿡ ����, ��, û��, ���� ������ ����� ����� ����� �ۼ��Ͻÿ� 
		// (�Ҽ��� 2�ڸ� �� ������ ���)
		int result = 0;
		result = (int)(price + service + flavor + clean) / 4 *100;
		int a = result / 100;
		
		return a;
	}

}
