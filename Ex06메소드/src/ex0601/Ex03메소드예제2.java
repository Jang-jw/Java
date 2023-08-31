package ex0601;

import java.util.Scanner;

public class Ex03메소드예제2 {

	public static void main(String[] args) {

		// 1. 정수형 num1 과 num2 를 입력 받고
		// 문자형 op 를 선언해 원하는 연산자를 넣으세요.
		// 2. num1 과 num2 를 op 에 맞게 연산하여 최종 값을 반환해주는
		// cal 메소드를 만드세요.
		// 단, 빼기를 수행할 때는 더 큰 수에서 작은 수를 빼세요!
		Scanner sc = new Scanner(System.in);
		System.out.print("정수1 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("정수2 입력 : ");
		int num2 = sc.nextInt();
		char op = '-';
		System.out.println(cal(num1, num2, op));
		System.out.println(answer(num1, num2, op));

	}

	private static int cal(int num1, int num2, char op) {
		int result = 0;
		if (op == '+') {
			result = num1 + num2;
		} else if (op == '-') {
			if (num1 > num2) {
				result = num1 - num2;
			} else {
				result = num2 - num1;
			}
		} else if (op == '*') {
			result = num1 * num2;
		} else if (op == '/') {
			result = num1 / num2;
		}
		return result;
	}

	// 풀이
	public static int answer(int num1, int num2, char op) {
		if (op == '+') {
			return num1 + num2;
		} else if (op == '-') {
			if (num1 > num2) {
				return num1 - num2;
			} else {
				return num2 - num1;
			}
		} else if (op == '*') {
			return num1 * num2;
		} else {
			return num1 / num2;
		}
	}

}
