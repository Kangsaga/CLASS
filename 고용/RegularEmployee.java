package Exam04;

public class RegularEmployee extends Employee{
	
//	String empno;
//	String name;
//	int pay;
	int bonus;
	
	// ������ �����ε�
	public RegularEmployee(String empno, String name, int pay, int bonus) {
		super(empno, name, pay);
		// ���� Ŭ������ ����Ŵ!!
		
//		this.empno = empno;
//		this.name = name;
//		this.pay = pay;
		this.bonus = bonus;
	}


	public int getMoneyPay() {
		return (pay + bonus) / 12;
	}

//	public String print() {
//		return empno + " : " + name +" : "+ pay;
//	}
	
	
	
}
