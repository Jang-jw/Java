package javaFestival_final;

import java.util.Scanner;

public class _019_구구단_단수입력 {

	public static void main(String[] args) {

		// 19번, 제한시간 20분, 획득점수 : 35점

		// 단 수와 곱해지길 원하는 수를
		// 입력하여 이와 같이 출력되게 하시오.
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		System.out.print("단수입력 : ");
		num1 = sc.nextInt();
		System.out.print("어느 수까지 출력 : ");
		num2 = sc.nextInt();
		System.out.println(num1 + "단");
		for (int i = 1; i < num2 + 1; i++) {
			int result = num1 * i;
			System.out.println(num1 + "*" + i + "=" + result);
		}
	}

}
