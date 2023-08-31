package ex0612;

import java.util.ArrayList;
import java.util.Scanner;

import javazoom.jl.player.MP3Player;

public class Mp3Main {

	// 1.
	// 노래 --> 경로 / 제목 / 가사 / 장르 ...
	// 노래의 정보를 저장할 Class 를 설계

	// 2. 노래 정보를 포함한 객첵 생성 (총 5개)
	static String folder = "C:\\Users\\user\\Desktop\\JavaStudy\\player\\";

	// (1) 생성자를 사용해서 객체 안에 데이터를 채우는 방법
	static Music m1 = new Music("ANTIFRAGILE", "LE SSERAFIM", folder + "ANTIFRAGILE-LE SSERAFIM.mp3");

	// (2) 기본 생성자를 사용한 방법
	// 생성자 사용 방법 --> 유연성이 낮음, 필드가 많아지면 실수가 발생할 수 있다.
	static Music m2 = new Music();

	static Music m3 = new Music("HypeBoy", "NewJeans", folder + "HypeBoy_NewJeans.mp3");

	static Music m4 = new Music("I AM", "IVE", folder + "I AM_IVE.mp3");

	static Music m5 = new Music("NIGHT DANCER", "imase", folder + "NIGHT DANCER_imase.mp3");

	// 3. 노래 정보를 ArrayList 에 집어넣어 저장하기
	static ArrayList<Music> musicList = new ArrayList<Music>();

	static Scanner sc = new Scanner(System.in);
	static MP3Player mp3 = new MP3Player();

	// =============================================================

	static int idx = 0;

	public static void main(String[] args) {
		m2.setTitle("Cupid");
		m2.setSinger("FIFTY FIFTY");
		m2.setPath(folder + "Cupid-FIFTY FIFTY.mp3");
		musicList.add(m1);
		musicList.add(m2);
		musicList.add(m3);
		musicList.add(m4);
		musicList.add(m5);
		while (true) {
			System.out.print("[1]노래재생 [2]다음곡 [3]이전곡 [4]정지 [5]종료 >> ");
			int input = sc.nextInt();
			if (input == 1) {
				// 노래재생

				// 0) Music 하나를 가져와서 데이터 꺼내기
				Music music = musicList.get(idx);
				String title = music.getTitle();
				String singer = music.getSinger();
				String path = music.getPath();

				// 1) 재생중인 노래 제목, 가수 출력
				System.out.println("♬♬♬♬♬재생중인 노래♬♬♬♬♬");
				System.out.println("노래 제목\t\t가수");
				System.out.println(title + "\t" + singer);

				// 2) 노래 재생 (path)
				mp3.play(path);

			} else if (input == 2) {
				// 다음곡
				if (idx >= 0 && idx < musicList.size() - 1) {
					idx++;
				} else if (idx < 0) {
					idx = 0;
				} else {
					System.out.println("다음곡이 없습니다.");
					continue;
				}
				mp3.stop();
				musicGo();
			} else if (input == 3) {
				// 이전곡
				if (idx > 0 && idx <= musicList.size()) {
					idx--;
				} else if (idx > musicList.size()) {
					idx = musicList.size() - 1;
				} else {
					System.out.println("이전곡이 없습니다.");
					continue;
				}
				mp3.stop();
				musicGo();
			} else if (input == 4) {
				// 정지
				mp3.stop();
			} else if (input == 5) {
				// 종료
				System.out.println("프로그램을 종료합니다.");
				mp3.stop();
				break;
			} else {
				continue;
			}
		}

	}

	private static void musicGo() {
		Music music = musicList.get(idx);
		String title = music.getTitle();
		String singer = music.getSinger();
		String path = music.getPath();
		System.out.println("♬♬♬♬♬재생중인 노래♬♬♬♬♬");
		System.out.println("노래 제목\t\t가수");
		System.out.println(title + "\t" + singer);
		mp3.play(path);
	}
}
