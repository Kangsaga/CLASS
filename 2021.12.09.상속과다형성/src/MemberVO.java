
public class MemberVO {
	
	private String name;
	private int age;
	
	
	
	
	
	@Override
	public String toString() {
		return "MemberVO [name=" + name + ", age=" + age + "]";
	}



	public MemberVO(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	
//	public void setName(String name) {
//		this.name = name;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	
	
}
