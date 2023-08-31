package javaFestival_final;

import java.util.Scanner;

public class _016_8자리_정수의_합 {

	public static void main(String[] args) {

		// 16번, 제한시간 : 15분, 획득점수 : 25점

		// 8자리 정수를 입력받아 반복문을 활용하여
		// 입력받은 정수의 합을 구하여
		// 출력하는 프로그램을 작성하시오.
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		String num = sc.next();
		String[] array = num.split("");
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			int j = Integer.parseInt(array[i]);
			sum += j;
		}
		System.out.println("합은 " + sum + "입니다.");
	}

}
