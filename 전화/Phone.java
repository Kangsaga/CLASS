
public interface Phone {
	
	// �������̽��� ������ ���(������ ��)�� �ü��ִ� -> ���� �Ұ���
	// final �� ���� �����ϴ�
	
	// ��ư
	int button = 12;
	// ����Ŀ
	int speak = 4;
	// ����ũ
	final int mic = 2;
	
	
	// �������
	public abstract void Carmera();
	// ��ȭ���
	public abstract void Call();
	
	// �������̽����� �Ϲݸ޼ҵ�� ����� ����
	// ������ �߻� �޼ҵ�� �ν��ϱ⶧���� 
	// public abstract��  ���������ϴ�
	void Message(); // defalut abstract
	
	
	
	
}
