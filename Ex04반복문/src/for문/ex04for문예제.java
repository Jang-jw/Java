package for문;

import java.util.Scanner;

public class ex04for문예제 {

	public static void main(String[] args) {

		// 원하는 단을 입력 받아 구구단을 출력하세요.

		Scanner sc = new Scanner(System.in);
		System.out.print("단 입력 : ");
		int dan = sc.nextInt();

		for (int i = 1; i < 10; i++) {
			System.out.println(dan + "*" + i + "=" + dan * i);
		}

	}

}
