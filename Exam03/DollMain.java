package Exam03;

public class DollMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Machine ma = new Machine();
		Pika pika = new Pika();
		Piri fire = new Piri();
		Kkobok kkobok = new Kkobok();
		
		// �ӽ��� ���ؼ� ��ī�� ������ �̰� �;��
//		ma.getPika(pika);
//		ma.getPiri(fire);
//		ma.getKkobok(kkobok);
		ma.getDoll(pika);
		ma.getDoll(fire);
		ma.getDoll(kkobok);
		
		
		
	}

}
