// Salon Ŭ������ �ʵ�� �����ڴ� ������ �ʿ� ����
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
		// ���⿡ ���, ģ��, ����, ������ ����� ����ϴ� ����� �ۼ��Ͻÿ�
		// (�Ҽ��� 2�ڸ� �� ������ ���)
		int result = 0;
		result = (int)(price + technology + kindness ) / 3 *100;
		int a = result / 100;
		
		return a;
	}

}
