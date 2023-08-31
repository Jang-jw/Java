package ex0519;

import java.util.Scanner;

public class Ex04산술연산자예제1 {

	public static void main(String[] args) {

		// 1. 두 수를 입력받기
		Scanner sc = new Scanner(System.in);

		System.out.print("첫번재 정수입력: ");
		int a = sc.nextInt();

		System.out.print("두번째 정수입력: ");
		int b = sc.nextInt();

		// 2. 더한결과 출력하기
		// sum : 13
		System.out.println("더한 결과 값: " + a + b); // 괄호 없을 경우: 103
		System.out.println("더한 결과 값: " + (a + b));

		// 3. 뺀결과 출력하기
		// minus : 7
		System.out.println("뺀 결과 값: " + (a - b));

		// 4. 곱한결과 출력하기
		// multi : 30
		System.out.println("곱한 결과 값: " + (a * b)); // 괄호 생략 가능

		// 5. 나눈결과 출력하기
		// div : 3.3333333333333335
		// double c = a;
		// double d = b;
		// System.out.println("나눈 결과 값: " + (c / d));
		System.out.println("나눈 결과 값: " + a / (double) b); // 괄호 안 형변환
	}

}
