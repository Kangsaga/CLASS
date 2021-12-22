
public class Music {
	
	private String musicName; // 노래이름
	private String singer; // 가수이름
	private int playTime; // 재생시간
	private String path;
	
	public Music(String musicName, String singer, int playTime) {
		super();
		this.musicName = musicName;
		this.singer = singer;
		this.playTime = playTime;
	}
	
	// 생성자 오버로딩
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
		System.out.printf("[ 노래제목 : %s 가수 : %s 플레이타임 : %d분 %d초 ] %n",musicName,singer,playTime/60,playTime%60);
	}
	
}
