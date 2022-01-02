package Exam04;

public class EmployeeMain {

	public static void main(String[] args) {
		
		RegularEmployee regular = new RegularEmployee("201101", "박병관", 4000, 800);
		
		System.out.println(regular.print());
		
		// 월급여 출력
		System.out.println(regular.getMoneyPay() + "만원");
		// 계약직
		TempEmployee temp = new TempEmployee("201505", "승환", 3000);
		
		
		System.out.println(temp.print());
		// 알바
		PartTimeEmployee part = new PartTimeEmployee("201606", "수민", 50000, 12);
		
		System.out.println(part.print());
		// 매니저
		Manager manager = new Manager("200001", "동원", 5000, 1000);
		
		System.out.println(manager.print());
	}

}
