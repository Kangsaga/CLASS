
public class PigBank {
	
	int money;
	
	
	
	
	public PigBank(int money) {
		//super();
		this.money = money;
	}
	// 돈을 넣는다
	public void deposit(int inputMoney) {
		this.money = money + inputMoney;
	}
	// 돈을 인출한다
	public void withdraw(int outputMoney) {
		this.money = money - outputMoney;
	}
	//돈을 출력하는 메소드 showMoney()
	public void showMoney() {
		System.out.println("현재 금액 : " + money);
	}
}
