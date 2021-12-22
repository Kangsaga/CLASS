import java.util.ArrayList;
import java.util.Scanner;

import javazoom.jl.player.MP3Player;

public class MusicMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		MP3Player mp3 = new MP3Player(); // 음악을 실질적으로 재생시켜줄 객체

		// 음악리스트가될 ArrayList를 만들어 주세요
//		ArrayList<Music> musicList = new ArrayList<Music>();

//		musicList.add(new Music("깡", "Rain", 100, "C://music/Rain - 깡.mp3"));
//		musicList.add(new Music("Dalla Dalla", "Itzy", 120, "C://music/Itzy - Dalla Dalla.mp3 "));
//		musicList.add(new Music("SOLO", "JENNIE", 200, "C://music/JENNIE - SOLO.mp3"));
//		musicList.add(new Music("2002", "Anne Marie", 140, "C://music/Anne Marie - 2002.mp3"));
//		musicList.add(new Music("bad guy", "Billie Eilish ", 180, "C://music/Billie Eilish - bad guy.mp3"));
//		musicList.add(new Music("Circle of Life", "Carmen Twillie, Lebo M", 110, "C://music/Carmen Twillie, Lebo M. - Circle of Life.mp3"));
//		musicList.add(new Music("Let It Go", "Idina Menzel", 18, "C://music/Idina Menzel - Let It Go.mp3"));
		MusicPlayer player = new MusicPlayer();
		int index = 0; // 현재노래 위치정보

		// isplaying() -> 현재 재생중인지 판단하는 메소드
		// stop() -> 현재 재생중인 노래를 멈추는 메소드

		while (true) {

			System.out.print("1.재생 2.정지 3.다음곡 4.이전곡 5.종료 >>");
			int num = sc.nextInt();

			if (num == 1) {
				// 재생 -> 깡, Rain, 1분 40초
//				System.out.print(musicList.get(0).getMusicName() + " ");
//				System.out.print(musicList.get(0).getSinger() + " ");
//				System.out.println(musicList.get(0).getPlayTime() + " ");
//				musicList.get(index).show();
				
				
				//mp3.play(musicList.get(index).getPath()); // 재생 메소드 play(경로)
				// Controller 불러와서 실행하기
//				MusicPlayer player = new MusicPlayer();
				
				player.play();
				
				
			} else if (num == 2) {
				
				
					// 현재 재생중인 노래가 있다면 true
					// 현재 재생중인 노래가 없다면 false
					player.stop();
				

			} else if (num == 3) {
				// 다음곡 -> Dalla Dalla, Itzy, 2분
				// SOLO 이후로 다음곡을 누르면
				// '재생할곡이 없습니다'
//				System.out.print(musicList.get(1).getMusicName() + " ");
//				System.out.print(musicList.get(1).getSinger() + " ");
//				System.out.println(musicList.get(1).getPlayTime() + " ");

//				if (mp3.isPlaying()) {
//					mp3.stop();
//					
//				}
//				if (index < musicList.size() - 1) {
//					index++;
//					player.musicList.get(index).show();
//					mp3.play(musicList.get(index).getPath());
//
//				} else {
//					System.out.println("재생할곡이 없습니다");
//					index = 0;
//				}
				player.nextPlay();
				
				
				

			} else if (num == 4) {
				// 단, 깡 이전곡을 누르면 이전곡이 없습니다
//				if (mp3.isPlaying()) {
//					mp3.stop();
//				}
//				if (index > 0) {
//					index--;
//					player.musicList.get(index).show();
//					mp3.play(musicList.get(index).getPath());
//				} else {
//					System.out.println("이전곡이 없습니다");
//					index = musicList.size() - 1;
//				}
				player.previousPlay();
				
			} else if (num == 5) {
				System.out.println("프로그램 종료");
				break;
			}
		}

	}

}
