
public class PigBank {
	
	int money;
	
	
	
	
	public PigBank(int money) {
		//super();
		this.money = money;
	}
	// ���� �ִ´�
	public void deposit(int inputMoney) {
		this.money = money + inputMoney;
	}
	// ���� �����Ѵ�
	public void withdraw(int outputMoney) {
		this.money = money - outputMoney;
	}
	//���� ����ϴ� �޼ҵ� showMoney()
	public void showMoney() {
		System.out.println("���� �ݾ� : " + money);
	}
}
