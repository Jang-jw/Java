package javaFestival_final;

import java.util.Scanner;

public class _031_양의_정수의_곱 {

	public static void main(String[] args) {

		// 31번, 제한시간 : 35분, 획득점수 : 45점

		// 1보다 큰 정수(N)를 입력하여 N! 값을 구하시오.
		// 팩토리얼이란 N의 수보다 작거나 같은 모든 양의 정수의 곱
		// ex) 3! = 1 x 2 x 3 => 6
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		int num = sc.nextInt();
		int sum = 1;
		int result = 0;
		for (int i = 0; i < num; i++) {
			result = (i + 1) * sum;
			sum += result;
		}
		sum -= result;
		System.out.println("출력 : " + sum);
	}

}
