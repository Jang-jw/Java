package ex0519;

import java.util.Scanner;

public class Ex05산술연산자예제2 {

	public static void main(String[] args) {

		// 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력해 주세요: ");
		int num = sc.nextInt();

		// 출력하기
		// 111 -> 100
		// System.out.println(num / 100 + "00");
		System.out.println(num - num % 100); // 풀이

		// 입력받기
		System.out.print("숫자를 입력해 주세요: ");
		num = sc.nextInt();

		// 출력하기
		// 111 -> 100
		// System.out.println(num / 100 + "00");
		System.out.println(num - num % 100); // 풀이

		// 풀이
		// 1. 숫자 하나 입력 받기
		System.out.print("input num >> ");
		num = sc.nextInt();

		// 2. 백의 자리 이하를 버린 결과 계산
		// 입력 : 456
		// num - num%100 ==> 400
		int result = num - num % 100;

		// 3. 결과를 출력
		// result : 400
		System.out.println("result : " + result);
	}

}
