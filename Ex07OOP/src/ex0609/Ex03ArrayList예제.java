package ex0609;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex03ArrayList예제 {

	// 노래 이름 ( String ) 을 저장해 둘 ArrayList 생성
	static ArrayList<String> musicPlayList = new ArrayList<String>();

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			int input = 0;
			String inputString;
			System.out.println("=====뮤직 플레이어 시작~ ♬♬=====");
			System.out.print("[1]노래추가 [2]노래삭제 [3]노래조회 [4]종료 >> ");
			input = sc.nextInt();
			if (input == 1) {
				// 노래추가
				playList();
				System.out.print("[1]마지막 위치에 추가 [2]원하는 위치에 추가 >> ");
				input = sc.nextInt();
				System.out.print("추가할 노래 입력 >> ");
				sc.nextLine();
				inputString = sc.nextLine();
				if (input == 2) {
					// 원하는 위치에 추가
					System.out.print("원하는 위치를 입력하세요 >> ");
					input = sc.nextInt();
					if (input > 0 && input <= musicPlayList.size() + 1) {
						// 원하는 위치에 추가
						musicPlayList.add(input - 1, inputString);
					} else {
						// 마지막 위치에 추가
						musicPlayList.add(musicPlayList.size(), inputString);
					}
				} else {
					// 마지막 위치에 추가
					musicPlayList.add(musicPlayList.size(), inputString);
				}
				playList();
			} else if (input == 2) {
				// 노래 삭제
				System.out.print("원하는 위치를 입력하세요 >> ");
				input = sc.nextInt();
				if (input > 0 && input <= musicPlayList.size() + 1) {
					// 원하는 위치에 삭제
					musicPlayList.remove(input - 1);
				} else {
					System.out.println("목록에 없습니다.");
				}
				playList();
			} else if (input == 3) {
				// 노래조회
				playList();
			} else if (input == 4) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				continue;
			}
		}

	}

	private static void playList() {
		System.out.println("=====현재 재생 목록=====");
		if (musicPlayList.size() == 0) {
			System.out.println("재생목록이 없습니다.");
		} else if (musicPlayList.size() != 0) {
			for (int i = 0; i < musicPlayList.size(); i++) {
				System.out.println(i + 1 + ". " + musicPlayList.get(i));
			}
		}
	}
}