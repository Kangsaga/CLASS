
public class BookData {

	private String title;
	private int price;
	private String writer;

	public BookData(String title, int price, String writer) {
		super();
		this.title = title;
		this.price = price;
		this.writer = writer;
	}

	public String getTitle() {
		return title;
	}

	public int getPrice() {
		return price;
	}

	public String getWriter() {
		return writer;
	}
	
	public void Show() {
//		System.out.print("[");
//		System.out.print(title + " ");
//		System.out.print(price + " ");
//		System.out.print(writer+ " ");
//		System.out.println("]");
		System.out.printf("[ Á¦¸ñ: %s °¡°Ý: %d¿ø ÀúÀÚ: %s ]",title,price,writer);
		System.out.println();
	}
}
