
public class Music {
	
	private String musicName; // �뷡�̸�
	private String singer; // �����̸�
	private int playTime; // ����ð�
	private String path;
	
	public Music(String musicName, String singer, int playTime) {
		super();
		this.musicName = musicName;
		this.singer = singer;
		this.playTime = playTime;
	}
	// ������ �����ε�
	public Music(String musicName, String singer, int playTime, String path) {
		super();
		this.musicName = musicName;
		this.singer = singer;
		this.playTime = playTime;
		this.path = path;
	}

	
	

	public String getMusicName() {
		return musicName;
	}

	
	public String getSinger() {
		return singer;
	}

	public int getPlayTime() {
		return playTime;
	}
	
	public String getPath() {
		return path;
	}
	public void show() {
		System.out.printf("[ �뷡���� : %s ���� : %s �÷���Ÿ�� : %d�� %d�� ] %n",musicName,singer,playTime/60,playTime%60);
	}
	
	
	
}
