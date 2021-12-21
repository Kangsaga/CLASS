import java.util.ArrayList;
import java.util.Scanner;

public class BookMainint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BookData book1 = new BookData("자바", 10000, "병관");
		BookData book2 = new BookData("DataBase", 20000, "동원");
		BookData book3 = new BookData("Web", 30000, "승환");
		Scanner sc = new Scanner(System.in);

		BookData[] bookList = new BookData[3];
		bookList[0] = book1;
		bookList[1] = book2;
		bookList[2] = book3;
		
		ArrayList<BookData> array = new ArrayList<BookData>();
		array.add(book1);
		array.get(0).getTitle();

//		for (int i = 0; i < bookList.length; i++) {
//			System.out.print("책 제목 입력 : ");
//			String title = sc.next();
//			System.out.print("가격 입력 : ");
//			int price = sc.nextInt();
//			System.out.print("저자 입력 : ");
//			String writer = sc.next();
//			
//			BookData book = new BookData(title, price, writer);
//			bookList[i] = book;
//		}

		System.out.print("금액을 입력하세요 : ");
		int money = sc.nextInt();

		System.out.println("구매가능한 책 목록");
		for (int i = 0; i < bookList.length; i++) {

			if (bookList[i].getPrice() <= money) {
				bookList[i].Show();

			}
		}

		// bookList 사용해서 책이름을 전부 출력해주세요
//		System.out.println("책 제목 : " + bookList[0].getTitle());
//		System.out.println("책 제목 : " + bookList[1].getTitle());
//		System.out.println("책 제목 : " + bookList[2].getTitle());

		// private으로 감추어 놓았기 때문에 오류 발생
		// book1.title = "짜파게티";

		// private는 같은 클래스 내에서만 접근이 가능하다
		// protect는 같은 패키지 + 상속관계
		// default는 같은 패키지 내에서만 가능하다

		// private 으로 감추어진 정보를 접근하는 방법!!
//		System.out.println("책 제목 :" + bookList[0].getTitle());

	}

}
