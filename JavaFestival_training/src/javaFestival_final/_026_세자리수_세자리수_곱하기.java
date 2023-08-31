package javaFestival_final;

import java.util.Scanner;

public class _026_세자리수_세자리수_곱하기 {

	public static void main(String[] args) {

		// 26번, 제한시간 : 25분, 획득점수 : 40점

		// (세 자리 수) * (세 자리수) 는 다음과 같이 계산된다.
		// (1), (2) 번을 입력 받아 결과 화면처럼
		// (3), (4), (5), (6) 번을
		// 출력하는 프로그램을 작성하시오.
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 숫자 입력 >> ");
		int num1 = sc.nextInt();
		System.out.print("첫 번째 숫자 입력 >> ");
		int num2 = sc.nextInt();
		int val1 = num1 * (num2 % 10);
		int val2 = num1 * (num2 % 100 / 10);
		int val3 = num1 * (num2 / 100);
		System.out.println(val1);
		System.out.println(val2);
		System.out.println(val3);
		int result = val1 + val2 * 10 + val3 * 100;
		System.out.println(result);
	}

}
