import java.util.ArrayList;
import java.util.Scanner;

public class BookMainint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BookData book1 = new BookData("�ڹ�", 10000, "����");
		BookData book2 = new BookData("DataBase", 20000, "����");
		BookData book3 = new BookData("Web", 30000, "��ȯ");
		Scanner sc = new Scanner(System.in);

		BookData[] bookList = new BookData[3];
		bookList[0] = book1;
		bookList[1] = book2;
		bookList[2] = book3;
		
		ArrayList<BookData> array = new ArrayList<BookData>();
		array.add(book1);
		array.get(0).getTitle();

//		for (int i = 0; i < bookList.length; i++) {
//			System.out.print("å ���� �Է� : ");
//			String title = sc.next();
//			System.out.print("���� �Է� : ");
//			int price = sc.nextInt();
//			System.out.print("���� �Է� : ");
//			String writer = sc.next();
//			
//			BookData book = new BookData(title, price, writer);
//			bookList[i] = book;
//		}

		System.out.print("�ݾ��� �Է��ϼ��� : ");
		int money = sc.nextInt();

		System.out.println("���Ű����� å ���");
		for (int i = 0; i < bookList.length; i++) {

			if (bookList[i].getPrice() <= money) {
				bookList[i].Show();

			}
		}

		// bookList ����ؼ� å�̸��� ���� ������ּ���
//		System.out.println("å ���� : " + bookList[0].getTitle());
//		System.out.println("å ���� : " + bookList[1].getTitle());
//		System.out.println("å ���� : " + bookList[2].getTitle());

		// private���� ���߾� ���ұ� ������ ���� �߻�
		// book1.title = "¥�İ�Ƽ";

		// private�� ���� Ŭ���� �������� ������ �����ϴ�
		// protect�� ���� ��Ű�� + ��Ӱ���
		// default�� ���� ��Ű�� �������� �����ϴ�

		// private ���� ���߾��� ������ �����ϴ� ���!!
//		System.out.println("å ���� :" + bookList[0].getTitle());

	}

}
