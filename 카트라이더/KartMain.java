package Exam02;

import java.util.Scanner;

public class KartMain {

	public static void main(String[] args) {

		MyKart spotage = new MyKart();
		// 첫 시작점은 0! -> spotage.myposition -> 0

		Scanner sc = new Scanner(System.in);

		while (spotage.myposition < 100) {
			System.out.println("1.전진 2.후진 3.부스터");
			int menu = sc.nextInt();

			if (menu == 1) {
				// 차의 위치가 10만큼 앞으로 가야함
				spotage.go(10);
//				System.out.println("나의 위치 : " + spotage.myposition);
			} else if (menu == 2) {
				// 차의 위치가 10만큼 뒤로 가야함
				spotage.back(10);
//				System.out.println("나의 위치 : " + spotage.myposition);
			} else if (menu == 3) {
				// 차의 위치가 30앞으로 가야함
				spotage.booster(30);
//				System.out.println("나의 위치 : " + spotage.myposition);
			}
			System.out.println("나의 위치 : " + spotage.myposition);
		}
		System.out.println("도달완료");

	}

}
