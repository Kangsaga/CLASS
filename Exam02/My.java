package Exam02;

public class My {
		
	// ������ �Դ±��
	public void ������Open(������ snack) {
		snack.open();
	}
	// Ȩ���� �Դ� ���
	public void Ȩ����Open(Ȩ���� snack) {
		snack.open();
	}
	// ��Ĩ �Դ� ���
	public void ��ĨOpen(��Ĩ snack) {
		snack.open();
	}
	
	public void SnackOpen(Snack snack) {
		// snack �̶�� ��ü �ϳ��� ���� �ٸ� ����� �� �� �ְԲ� ������
		//---->������!!
		snack.open();
		// ��ĳ������ �� ���¿��� �Ͻ������� ����Ŭ������ �ִ�
		// ����� �����ϰ� ������! -> �ٿ� ĳ����!!
		// ����Ŭ������ �ٿ�ĳ���ð�ü�� = (����Ŭ������) ��ĳ���õȰ�ü��
		
		
		if (snack instanceof ��Ĩ) {
			// A instanceof B ->
			// A ��� ��ü�� B�κ��� ��ĳ���õ� ��ü��� -> true ��ȯ
			// �ƴ϶�� false ��ȯ
			
			// snack ��� ������ ��Ĩ���κ��� 
			// ��ĳ���õ� �������
			// �ٿ�ĳ�������ּ���
			��Ĩ ssunchip = (��Ĩ) snack;
			ssunchip.sorce();
		}
	}
}
