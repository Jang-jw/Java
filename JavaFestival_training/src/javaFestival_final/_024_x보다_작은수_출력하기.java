package javaFestival_final;

import java.util.Scanner;

public class _024_x보다_작은수_출력하기 {

	public static void main(String[] args) {

		// 24번, 제한시간 : 20분, 획득점수 : 40점

		// 다음과 같은 프로그램을 작성하시오.
		// N 과 X 를 입력 받는다.
		// N 개의 정수를 입력 받는다.
		// N 개의 숫자 중 X 보다 작은 수만 출력 한다.
		Scanner sc = new Scanner(System.in);
		System.out.print("N 입력 >> ");
		int num1 = sc.nextInt();
		System.out.print("X 입력 >> ");
		int num2 = sc.nextInt();
		int[] result = new int[num1];
		for (int i = 0; i < result.length; i++) {
			System.out.print(i + 1 + "번째 정수 입력 >> ");
			int num3 = sc.nextInt();
			if (num3 < num2) {
				result[i] = num3;
			}
		}
		System.out.print("결과 >> ");
		for (int i = 0; i < result.length; i++) {
			if (result[i] == 0) {
				continue;
			}
			System.out.print(result[i] + " ");
		}
	}

}
