package Exam01;

public class AnimalMain {

	public static void main(String[] args) {
		
		Animal ani = new Animal();
		
		System.out.println("���� ���� : " + ani.claw);
		System.out.println("���� ���� : " + ani.tailSize);
		System.out.println("���� : " + ani.pattern);
		System.out.println("�̻� ���� : " + ani.teeth);
		
		// �������̵��� ���ؼ� ���̸� �ٲ�
		Dog dog = new Dog();
		dog.pattern = "�ٹ���";
		
		//��ĳ������ ��
		Animal ani2 = dog;
		System.out.println(ani2.pattern);
		
		// ��ĳ������ �߱� ������ �θ� �ִ� �����
		// �θ� �������̵��� �ص� �ٲ��
		// ���� �ּҰ��� ������ ������
		ani2.pattern = "�����";
		System.out.println(dog.pattern);
		
		

	}

}
