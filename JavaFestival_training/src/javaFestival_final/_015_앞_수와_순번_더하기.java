package javaFestival_final;

import java.util.Scanner;

public class _015_앞_수와_순번_더하기 {

	public static void main(String[] args) {

		// 15번, 제한시간 : 15분, 획득점수 : 25점

		// 정수 n 을 입력받아
		// 1,2,4,7,11 과 같은 수열의
		// n 번째 항까지 출력하시오.
		Scanner sc = new Scanner(System.in);
		System.out.print("n 입력 : ");
		int num = sc.nextInt();
		int sum = 1;
		for (int i = 1; i < num + 1; i++) {
			System.out.print(sum + " ");
			sum += i;
		}
	}

}
