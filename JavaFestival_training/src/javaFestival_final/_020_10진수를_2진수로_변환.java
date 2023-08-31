package javaFestival_final;

import java.util.Scanner;

public class _020_10진수를_2진수로_변환 {

	public static void main(String[] args) {

		// 20번, 제한시간 : 20분, 획득점수 : 35점

		// 10진수 정수를 입력받아
		// 2진수로 변환해서 출력하시오.
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자입력>>");
		int num = sc.nextInt();
		int val = num;
		int cnt = 0;
		while (val > 0) {
			cnt++;
			val /= 2;
		}
		int[] array = new int[cnt];
		for (int i = 0; i < array.length; i++) {
			array[i] = num % 2;
			num /= 2;
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[array.length - i - 1] + " ");
		}
		System.out.println();

		num = 10;
		String result = "";
		while (num > 0) {
			val = num % 2;
			result = val + " " + result;
			num /= 2;
		}
		System.out.println(result);
	}

}
