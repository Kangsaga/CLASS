package 전화번호;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		ArrayList<Address> addressList = new ArrayList<Address>();

		while (true) {
			System.out.print("[1]추가 [2]전체조회 [3]삭제 [4]검색 [5]종료 >>");
			int num = sc.nextInt();

			if (num == 1) {
				// 전화번호부 (addressList)에 값을 추가하고싶다
				// 이름 나이 전화번호를 입력받아서 -> 객체로 만들어서
				// addressList 추가 시킴
				System.out.print("이름 : ");
				String name = sc.next();
				System.out.print("나이 : ");
				int age = sc.nextInt();
				System.out.print("전화번호 : ");
				String phoneNumber = sc.next();

				Address address = new Address(name, age, phoneNumber);
				addressList.add(address);

			} else if (num == 2) {
				for (int i = 0; i < addressList.size(); i++) {
					System.out.print(i+1 + ".");
					addressList.get(i).show();
					
				}if (addressList.size() == 0){
					System.out.println("등록된 연락처가 없습니다");
				}

			} else if (num == 3) {
				for (int i = 0; i < addressList.size(); i++) {
					System.out.print(i+1 + ".");
					addressList.get(i).show();
				}
				System.out.print("삭제할 번호를 누르세요 >>");
				int num2 = sc.nextInt();
				
				addressList.remove(num2-1);

			} else if (num == 4) {
				boolean sn= false;
				System.out.print("이름 검색 : ");
				String serchName = sc.next();
				for (int i = 0; i < addressList.size(); i++) {
					if (addressList.get(i).getName().equals(serchName)) {
						addressList.get(i).show();
						sn = true;
					}
					if(sn == false) {
						System.out.println("검색 내용이 없습니다");
					}
				}

			} else if (num == 5) {
				System.out.println("종료");
				break;
			}
		}

	}

}
