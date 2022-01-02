package Exam04;

public class Manager extends Employee {

	// 강제성을 뛰우고 싶을때 사용

//	String empno;
//	String name;
//	int pay;
	int bonus;

	public Manager(String empno, String name, int pay, int bonus) {
		super(empno, name, pay);
		// 상위 클래스를 가르킴!!
		
//		this.empno = empno;
//		this.name = name;
//		this.pay = pay;
		this.bonus = bonus;
	}

	@Override
	public int getMoneyPay() {
		return (pay + bonus) * 2 / 12;
	}

//	@Override
//	public String print() {
//		return empno + " : " + name + " : " + pay;
//	}

}
