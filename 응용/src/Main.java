import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Scanner와 StoreController 객체는 건들지 말 것
		Scanner sc = new Scanner(System.in);
		StoreController controller = new StoreController();
		// ------------------------------------------------

		while (true) {
			System.out.print("[1]음식점보기 [2]미용실보기 [3]상세보기 [4]평점보기 [5]종료 >> ");
			int choice = sc.nextInt();
			if (choice == 1) {
				System.out.println("====음식점보기====");

				ArrayList<Store> list = new ArrayList<Store>();
				list = controller.getList();

				for (int i = 0; i < list.size(); i++) {
					if (list.get(i).event.equals("음식점")) {
						System.out.print(list.get(i).name + "\t");
						System.out.println("평점 : " + list.get(i).grade());
					}
				}

			} else if (choice == 2) {
				System.out.println("====미용실보기====");

				ArrayList<Store> list = new ArrayList<Store>();
				list = controller.getList();

				for (int i = 0; i < list.size(); i++) {
					if (list.get(i).event.equals("미용실")) {
						System.out.print(list.get(i).name + "\t");
						System.out.println("평점 : " + list.get(i).grade());
					}
				}

			} else if (choice == 3) {
				System.out.println("====상세정보====");
				System.out.print("식당 입력 : ");
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
				System.out.println("평점 : " + list.get(0).grade());

			} else if (choice == 4) {
				System.out.println("====평점보기====");

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
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("정확한 숫자를 입력해주세요.");
			}
		}
		sc.close();
	}

}
