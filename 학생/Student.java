
public class Student {
	
	
	String name;
	String number;
	int age;
	int scorejava;
	int scoreWeb;
	int scoreAndroid;
	public Student(String name, String number, int age, int scorejava, int scoreWeb, int scoreAndroid) {
		//super();
		this.name = name;
		this.number = number;
		this.age = age;
		this.scorejava = scorejava;
		this.scoreWeb = scoreWeb;
		this.scoreAndroid = scoreAndroid;
	}
	public void show() {
		System.out.println(name + "�� �ȳ��ϼ���.");
		System.out.println("[ " + number + ", " + age + "��" + " ]");
		System.out.println(name + "���� Java������ " + scorejava + "�� �Դϴ�");
		System.out.println(name + "���� Web������ " + scoreWeb + "�� �Դϴ�");
		System.out.println(name + "���� Android������ " + scoreAndroid + "�� �Դϴ�");
		System.out.println("======================================================");
	}
	
}
