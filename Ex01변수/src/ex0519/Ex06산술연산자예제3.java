package ex0519;

import java.util.Scanner;

public class Ex06산술연산자예제3 {

	public static void main(String[] args) {

		// 초 입력 : 3723
		Scanner sc = new Scanner(System.in);
		System.out.print("초를 입력하세요: ");
		int s = sc.nextInt();
//		int s = 3723;

		// 시간 출력 : 1시2분3초
		int m = s / 60 - 60;
		int h = (m + 60) / 60;
		s = s % 60;
		System.out.println("입력한 시간은 " + h + "시" + m + "분" + s + "초 입니다.");

		System.out.print("초를 입력하세요: ");
		s = sc.nextInt();
		h = s / 3600;
		m = s % 3600 / 60;
		s = s % 3600 % 60;
		System.out.println("입력한 시간은 " + h + "시" + m + "분" + s + "초 입니다.");

		// 풀이
		// 입력
		System.out.print("초를 입력하세요: ");
		int totalSecond = sc.nextInt();

		// 1. 시간
		int hour = totalSecond / 3600;
		// 2. 분
		int min = totalSecond % 3600 / 60;
		// 3. 초
		int second = totalSecond % 60;
		// 4. 출력
		System.out.println(hour + "시" + min + "분" + second + "초");
	}

}
