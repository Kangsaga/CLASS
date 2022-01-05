package exam01;

import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		// 상속과 다형성
		// 상속 : 물려받아서 확장시킨다
								
		PtkJjajang ptkJjajang = new PtkJjajang();
		PjeJjajang pjeJjajang = new PjeJjajang();
		PwjJjajang pwjJjajang = new PwjJjajang();
		PmsJjajang pmsJjajang = new PmsJjajang();
		
		PbkJjajang p1 = ptkJjajang;
		PbkJjajang p2 = pjeJjajang;
		PbkJjajang p3 = pwjJjajang;
		PbkJjajang p4 = pmsJjajang;
		
		p1.makeJjajang();
		PtkJjajang newPtkJjajang = (PtkJjajang)p1;
		newPtkJjajang.makeBingsu();
		
		
		ArrayList<PbkJjajang> list = new ArrayList<PbkJjajang>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		
		
		
	}
	
}
