package ��ȭ��ȣ;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		ArrayList<Address> addressList = new ArrayList<Address>();

		while (true) {
			System.out.print("[1]�߰� [2]��ü��ȸ [3]���� [4]�˻� [5]���� >>");
			int num = sc.nextInt();

			if (num == 1) {
				// ��ȭ��ȣ�� (addressList)�� ���� �߰��ϰ�ʹ�
				// �̸� ���� ��ȭ��ȣ�� �Է¹޾Ƽ� -> ��ü�� ����
				// addressList �߰� ��Ŵ
				System.out.print("�̸� : ");
				String name = sc.next();
				System.out.print("���� : ");
				int age = sc.nextInt();
				System.out.print("��ȭ��ȣ : ");
				String phoneNumber = sc.next();

				Address address = new Address(name, age, phoneNumber);
				addressList.add(address);

			} else if (num == 2) {
				for (int i = 0; i < addressList.size(); i++) {
					System.out.print(i+1 + ".");
					addressList.get(i).show();
					
				}if (addressList.size() == 0){
					System.out.println("��ϵ� ����ó�� �����ϴ�");
				}

			} else if (num == 3) {
				for (int i = 0; i < addressList.size(); i++) {
					System.out.print(i+1 + ".");
					addressList.get(i).show();
				}
				System.out.print("������ ��ȣ�� �������� >>");
				int num2 = sc.nextInt();
				
				addressList.remove(num2-1);

			} else if (num == 4) {
				boolean sn= false;
				System.out.print("�̸� �˻� : ");
				String serchName = sc.next();
				for (int i = 0; i < addressList.size(); i++) {
					if (addressList.get(i).getName().equals(serchName)) {
						addressList.get(i).show();
						sn = true;
					}
					if(sn == false) {
						System.out.println("�˻� ������ �����ϴ�");
					}
				}

			} else if (num == 5) {
				System.out.println("����");
				break;
			}
		}

	}

}
