
public class MouseMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mouse mouse1 = new Mouse();
		mouse1.Click();
		mouse1.RightClick();
		
		WheelMouse mouse2 = new WheelMouse();
		mouse2.scllor(); //Ȯ��
		mouse2.Click(); //��� + �������̵�
		mouse2.RightClick(); // ���
		
		// ��ĳ���� -> ���� Ŭ������ ��ü��
		// ���� Ŭ������ ��ü Ÿ������ ����ȯ!!
		Mouse mouse3 = mouse2;
		mouse3.RightClick();
		// Mouse�� ����ȭ�� ���ױ� ������
		// WheelMouse�� ����� ����Ҽ� ����
		// mouse3.scllor();
		
		// WheelMouse ���� �������̵��� �޼ҵ�� �ٲ��� �ʰ� �����Ѵ�
		// WheelMouse �� �ִ� ��ɿ� Mouse�� ��ɿ� ������
		// ��,����� Wheelmouse�� ����� ����Ѵ�
		mouse3.Click();
		
	}

}
