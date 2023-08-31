package test0616;

import java.util.Scanner;

public class MusicPlayer {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		MusicVo mv = new MusicVo();
		MusicController mc = new MusicController();
		int idx = 0;

		while (true) {
			System.out.print("1.등록  2.목록  3.실행  4.이전곡  5.다음곡  6.종료 >> ");
			int input = sc.nextInt();

			if (input == 1) {
				// 등록
				System.out.print("제목 : ");
				String title = sc.next();
				System.out.print("가수 : ");
				String singer = sc.next();
				System.out.print("시간 : ");
				int time = sc.nextInt();

				MusicVo m = new MusicVo(title, singer, time);

				mv.listUP();
				mv.listUPAll();

			} else if (input == 2) {
				// 목록
				int len = mc.listTitle.size();

				System.out.println("=====노래목록=====");
				for (int i = 0; i < len; i++) {
					System.out.println(i + 1 + ". 제목 : " + mc.listTitle.get(i) + "\t 가수 : " + mc.listSinger.get(i)
							+ "\t" + "시간 : " + mc.listTime.get(i));
				}
			} else if (input == 3) {
				// 노래 정보
				System.out.println("=====실행=====");
				System.out.println("제목 : " + mc.listTitle.get(idx) + "\t 가수 : " + mc.listSinger.get(idx) + "\t"
						+ "시간 : " + mc.listTime.get(idx));
			} else if (input == 4) {
				// 이전곡
				System.out.println("=====이전곡=====");
				if (idx > 0 && idx <= mc.musicList.size()) {
					idx--;
				} else if (idx > mc.musicList.size()) {
					idx = mc.musicList.size() - 1;
				} else {
					System.out.println("이전곡이 없습니다.");
					continue;
				}
				System.out.println("제목 : " + mc.listTitle.get(idx) + "\t 가수 : " + mc.listSinger.get(idx) + "\t"
						+ "시간 : " + mc.listTime.get(idx));
			} else if (input == 5) {
				// 다음곡
				System.out.println("=====다음곡=====");
				if (idx >= 0 && idx < mc.musicList.size() - 1) {
					idx++;
				} else if (idx < 0) {
					idx = 0;
				} else {
					System.out.println("다음곡이 없습니다.");
					continue;
				}
				System.out.println("제목 : " + mc.listTitle.get(idx) + "\t 가수 : " + mc.listSinger.get(idx) + "\t"
						+ "시간 : " + mc.listTime.get(idx));
			} else if (input == 6) {
				// 종료
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("정확한 숫자를 입력해주세요.");
				continue;
			}
		}
	}

}
