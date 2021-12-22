import java.util.ArrayList;

import javazoom.jl.player.MP3Player;

public class MusicPlayer {
	
	// Controller : 실직적인 기능이 수행될 클라스
	
	ArrayList<Music> musicList = new ArrayList<Music>();
	MP3Player mp3 = new MP3Player();
	int index = 0;
	
	public MusicPlayer() {
		musicList.add(new Music("깡", "Rain", 100, "C://music/Rain - 깡.mp3"));
		musicList.add(new Music("Dalla Dalla", "Itzy", 120, "C://music/Itzy - Dalla Dalla.mp3 "));
		musicList.add(new Music("SOLO", "JENNIE", 200, "C://music/JENNIE - SOLO.mp3"));
		musicList.add(new Music("2002", "Anne Marie", 140, "C://music/Anne Marie - 2002.mp3"));
		musicList.add(new Music("bad guy", "Billie Eilish ", 180, "C://music/Billie Eilish - bad guy.mp3"));
		musicList.add(new Music("Circle of Life", "Carmen Twillie, Lebo M", 110, "C://music/Carmen Twillie, Lebo M. - Circle of Life.mp3"));
		musicList.add(new Music("Let It Go", "Idina Menzel", 18, "C://music/Idina Menzel - Let It Go.mp3"));
	}
	
	// 재생기능 빼주기
	public void play() {
		mp3.play(musicList.get(index).getPath());
		musicList.get(index).show();
	}
	
	public void stop() {
		mp3.stop();
		System.out.println("음악을 정지합니다");
	}
	
	//다음 곡을 실행할 기능
	public void nextPlay() {
		if (mp3.isPlaying()) {
			mp3.stop();
			
		}
		
		if (index < musicList.size() - 1) {
			index++;
			musicList.get(index).show();
			mp3.play(musicList.get(index).getPath());

		} else {
			System.out.println("재생할곡이 없습니다");
			index = 0;
		}
	}
	
	//이전곡을 실행할 기능
	public void previousPlay() {
		if (mp3.isPlaying()) {
			mp3.stop();
		}
		if (index > 0) {
			index--;
			musicList.get(index).show();
			mp3.play(musicList.get(index).getPath());
		} else {
			System.out.println("이전곡이 없습니다");
			index = musicList.size() - 1;
		}
	}
	
	
	
}
