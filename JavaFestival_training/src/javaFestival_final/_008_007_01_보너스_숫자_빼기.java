package javaFestival_final;

import java.util.Scanner;

public class _008_007_01_보너스_숫자_빼기 {

	public static void main(String[] args) {

		// 보너스 1번, 제한시간 : 12분, 획득점수 : 22점

		// 다음과 같은 프로그램을 작성하시오.
		// A, B 숫자를 입력 받는다.
		// A-B 를 출력한다.
		// A 와 B 가 모두 0 을 입력 받으면
		// 프로그램이 종료된다.
		Scanner sc = new Scanner(System.in);
		int result = 0;
		while (true) {
			System.out.print("A 입력 >> ");
			int num1 = sc.nextInt();
			System.out.print("B 입력 >> ");
			int num2 = sc.nextInt();
			if (num1 == 0 && num2 == 0) {
				break;
			} else {
				result = num1 - num2;
			}
			System.out.println("결과 >> " + result);

		}

	}

}
