package javaFestival_final;

import java.util.Scanner;

public class _005_별찍기_삼각형 {

	public static void main(String[] args) {

		// 5번, 제한시간 : 10분, 획득점수 : 15점

		// 행 개수를 입력 받아 다음과 같이
		// 삼각형을 출력하시오.
		Scanner sc = new Scanner(System.in);
		System.out.print("행개수 : ");
		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
