import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Scanner�� StoreController ��ü�� �ǵ��� �� ��
		Scanner sc = new Scanner(System.in);
		StoreController controller = new StoreController();
		// ------------------------------------------------

		while (true) {
			System.out.print("[1]���������� [2]�̿�Ǻ��� [3]�󼼺��� [4]�������� [5]���� >> ");
			int choice = sc.nextInt();
			if (choice == 1) {
				System.out.println("====����������====");

				ArrayList<Store> list = new ArrayList<Store>();
				list = controller.getList();

				for (int i = 0; i < list.size(); i++) {
					if (list.get(i).event.equals("������")) {
						System.out.print(list.get(i).name + "\t");
						System.out.println("���� : " + list.get(i).grade());
					}
				}

			} else if (choice == 2) {
				System.out.println("====�̿�Ǻ���====");

				ArrayList<Store> list = new ArrayList<Store>();
				list = controller.getList();

				for (int i = 0; i < list.size(); i++) {
					if (list.get(i).event.equals("�̿��")) {
						System.out.print(list.get(i).name + "\t");
						System.out.println("���� : " + list.get(i).grade());
					}
				}

			} else if (choice == 3) {
				System.out.println("====������====");
				System.out.print("�Ĵ� �Է� : ");
				String searchStore = sc.next();

				ArrayList<Store> list = new ArrayList<Store>();
				list = controller.getStore(searchStore);

				for (int i = 10; i <= 100; i += 10) {
					System.out.printf("%d \t", i);
				}
				System.out.println();
				for (int i = 10; i <= 100; i += 10) {
					for (int j = 0; j < list.size(); j++) {
						if (i < list.get(j).grade()) {
							System.out.printf("%c \t", '*');
						}
					}
				}
				System.out.println();
				System.out.println("���� : " + list.get(0).grade());

			} else if (choice == 4) {
				System.out.println("====��������====");

				ArrayList<Store> list = new ArrayList<Store>();
				list = controller.getList();

				for (int i = 100; i > 0; i -= 10) {
					System.out.printf("%d\t", i);
					for (int j = 0; j < list.size(); j++) {
						if (i < list.get(j).grade()) {
							System.out.printf("%c\t", '*');
						} else {
							System.out.print("\t");
						}
					}

					System.out.println();
				}
				System.out.print("\t");
				for (int i = 0; i < list.size(); i++) {
					System.out.printf("%s\t", list.get(i).name);
				}

				System.out.println();

			} else if (choice == 5) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			} else {
				System.out.println("��Ȯ�� ���ڸ� �Է����ּ���.");
			}
		}
		sc.close();
	}

}
