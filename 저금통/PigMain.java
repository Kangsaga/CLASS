import java.util.Scanner;

public class PigMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PigBank bank = new PigBank(1000);
		
		System.out.println("현재 금액 : " + bank.money);
		Scanner sc = new Scanner(System.in);
		System.out.print("입금액 입력 >>");
		
		int inputMoney = sc.nextInt();
		
		bank.deposit(inputMoney);
		System.out.println("현재 금액 : " + bank.money);
		
		System.out.print("출금할 금액 입력 >> ");
		int outputMoney = sc.nextInt();
		
		bank.withdraw(outputMoney);
		System.out.println("현재 금액 : " + bank.money);
		
		//현재금액 보여주는 메소드
		bank.showMoney();
	}

}
