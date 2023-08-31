package for문;

import java.util.Scanner;

public class ex05for문예제 {

	public static void main(String[] args) {

		// 구구단
		// 원하는 단과 어느 수까지 출력할 건지 입력 받아 구구단을 출력하세요.

		Scanner sc = new Scanner(System.in);
		System.out.print("단 입력 : ");
		int dan = sc.nextInt();
		System.out.print("어느 수까지 출력 : ");

		int max = sc.nextInt();
		for (int i = 1; i <= max; i++) {
			System.out.println(dan + "*" + i + "=" + dan * i);
		}

	}

}
