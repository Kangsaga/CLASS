package Exam02;

import java.util.Scanner;

public class KartMain {

	public static void main(String[] args) {

		MyKart spotage = new MyKart();
		// ù �������� 0! -> spotage.myposition -> 0

		Scanner sc = new Scanner(System.in);

		while (spotage.myposition < 100) {
			System.out.println("1.���� 2.���� 3.�ν���");
			int menu = sc.nextInt();

			if (menu == 1) {
				// ���� ��ġ�� 10��ŭ ������ ������
				spotage.go(10);
//				System.out.println("���� ��ġ : " + spotage.myposition);
			} else if (menu == 2) {
				// ���� ��ġ�� 10��ŭ �ڷ� ������
				spotage.back(10);
//				System.out.println("���� ��ġ : " + spotage.myposition);
			} else if (menu == 3) {
				// ���� ��ġ�� 30������ ������
				spotage.booster(30);
//				System.out.println("���� ��ġ : " + spotage.myposition);
			}
			System.out.println("���� ��ġ : " + spotage.myposition);
		}
		System.out.println("���޿Ϸ�");

	}

}
