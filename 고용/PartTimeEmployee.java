package Exam04;

public class PartTimeEmployee extends Employee{
	
	// 자식클래스에서는 무조건 상속받는 추상 메소드가 있어야함
	
//	String empno;
//	String name;
//	int pay;
	int workDay;
	
	public PartTimeEmployee(String empno, String name, int pay, int workDay) {
		super(empno, name, pay);
		// 상위 클래스를 가르킴!!
		
//		this.empno = empno;
//		this.name = name;
//		this.pay = pay;
		this.workDay = workDay;
	}
	
	public int getMoneyPay() {
		return pay * workDay;
	}
//	
//	public String print() {
//		return empno + " : " + name +" : "+ pay; 
//	}
	
}
