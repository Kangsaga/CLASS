import java.util.Scanner;

public class PigMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PigBank bank = new PigBank(1000);
		
		
		
		System.out.println("���� �ݾ� : " + bank.money);
		Scanner sc = new Scanner(System.in);
		System.out.print("�Աݾ� �Է� >>");
		
		int inputMoney = sc.nextInt();
		
		bank.deposit(inputMoney);
		System.out.println("���� �ݾ� : " + bank.money);
		
		
		System.out.print("����� �ݾ� �Է� >> ");
		int outputMoney = sc.nextInt();
		
		bank.withdraw(outputMoney);
		System.out.println("���� �ݾ� : " + bank.money);
		
		
		//����ݾ� �����ִ� �޼ҵ�
		bank.showMoney();
		
		
		
	}

}
