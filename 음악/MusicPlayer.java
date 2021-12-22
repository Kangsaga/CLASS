import java.util.ArrayList;

import javazoom.jl.player.MP3Player;

public class MusicPlayer {
	
	// Controller : �������� ����� ����� Ŭ��
	
	ArrayList<Music> musicList = new ArrayList<Music>();
	MP3Player mp3 = new MP3Player();
	int index = 0;
	
	public MusicPlayer() {
		musicList.add(new Music("��", "Rain", 100, "C://music/Rain - ��.mp3"));
		musicList.add(new Music("Dalla Dalla", "Itzy", 120, "C://music/Itzy - Dalla Dalla.mp3 "));
		musicList.add(new Music("SOLO", "JENNIE", 200, "C://music/JENNIE - SOLO.mp3"));
		musicList.add(new Music("2002", "Anne Marie", 140, "C://music/Anne Marie - 2002.mp3"));
		musicList.add(new Music("bad guy", "Billie Eilish ", 180, "C://music/Billie Eilish - bad guy.mp3"));
		musicList.add(new Music("Circle of Life", "Carmen Twillie, Lebo M", 110, "C://music/Carmen Twillie, Lebo M. - Circle of Life.mp3"));
		musicList.add(new Music("Let It Go", "Idina Menzel", 18, "C://music/Idina Menzel - Let It Go.mp3"));
	}
	
	// ������ ���ֱ�
	public void play() {
		mp3.play(musicList.get(index).getPath());
		musicList.get(index).show();
	}
	public void stop() {
		mp3.stop();
		System.out.println("������ �����մϴ�");
	}
	//���� ���� ������ ���
	public void nextPlay() {
		if (mp3.isPlaying()) {
			mp3.stop();
			
		}
		if (index < musicList.size() - 1) {
			index++;
			musicList.get(index).show();
			mp3.play(musicList.get(index).getPath());

		} else {
			System.out.println("����Ұ��� �����ϴ�");
			index = 0;
		}
	}
	//�������� ������ ���
	public void previousPlay() {
		if (mp3.isPlaying()) {
			mp3.stop();
		}
		if (index > 0) {
			index--;
			musicList.get(index).show();
			mp3.play(musicList.get(index).getPath());
		} else {
			System.out.println("�������� �����ϴ�");
			index = musicList.size() - 1;
		}
	}
	
	
	
}
