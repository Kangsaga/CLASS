import java.util.ArrayList;
import java.util.Scanner;

import javazoom.jl.player.MP3Player;

public class MusicMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		MP3Player mp3 = new MP3Player(); // ������ ���������� ��������� ��ü

		// ���Ǹ���Ʈ���� ArrayList�� ����� �ּ���
//		ArrayList<Music> musicList = new ArrayList<Music>();

//		musicList.add(new Music("��", "Rain", 100, "C://music/Rain - ��.mp3"));
//		musicList.add(new Music("Dalla Dalla", "Itzy", 120, "C://music/Itzy - Dalla Dalla.mp3 "));
//		musicList.add(new Music("SOLO", "JENNIE", 200, "C://music/JENNIE - SOLO.mp3"));
//		musicList.add(new Music("2002", "Anne Marie", 140, "C://music/Anne Marie - 2002.mp3"));
//		musicList.add(new Music("bad guy", "Billie Eilish ", 180, "C://music/Billie Eilish - bad guy.mp3"));
//		musicList.add(new Music("Circle of Life", "Carmen Twillie, Lebo M", 110, "C://music/Carmen Twillie, Lebo M. - Circle of Life.mp3"));
//		musicList.add(new Music("Let It Go", "Idina Menzel", 18, "C://music/Idina Menzel - Let It Go.mp3"));
		MusicPlayer player = new MusicPlayer();
		int index = 0; // ����뷡 ��ġ����

		// isplaying() -> ���� ��������� �Ǵ��ϴ� �޼ҵ�
		// stop() -> ���� ������� �뷡�� ���ߴ� �޼ҵ�

		while (true) {

			System.out.print("1.��� 2.���� 3.������ 4.������ 5.���� >>");
			int num = sc.nextInt();

			if (num == 1) {
				// ��� -> ��, Rain, 1�� 40��
//				System.out.print(musicList.get(0).getMusicName() + " ");
//				System.out.print(musicList.get(0).getSinger() + " ");
//				System.out.println(musicList.get(0).getPlayTime() + " ");
//				musicList.get(index).show();
				
				
				//mp3.play(musicList.get(index).getPath()); // ��� �޼ҵ� play(���)
				// Controller �ҷ��ͼ� �����ϱ�
//				MusicPlayer player = new MusicPlayer();
				
				player.play();
				
				
			} else if (num == 2) {
				
				
					// ���� ������� �뷡�� �ִٸ� true
					// ���� ������� �뷡�� ���ٸ� false
					player.stop();
				

			} else if (num == 3) {
				// ������ -> Dalla Dalla, Itzy, 2��
				// SOLO ���ķ� �������� ������
				// '����Ұ��� �����ϴ�'
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
//					System.out.println("����Ұ��� �����ϴ�");
//					index = 0;
//				}
				player.nextPlay();
				
				
				

			} else if (num == 4) {
				// ��, �� �������� ������ �������� �����ϴ�
//				if (mp3.isPlaying()) {
//					mp3.stop();
//				}
//				if (index > 0) {
//					index--;
//					player.musicList.get(index).show();
//					mp3.play(musicList.get(index).getPath());
//				} else {
//					System.out.println("�������� �����ϴ�");
//					index = musicList.size() - 1;
//				}
				player.previousPlay();
				
			} else if (num == 5) {
				System.out.println("���α׷� ����");
				break;
			}
		}

	}

}
