package ex0601;

import java.util.Scanner;

public class Ex04메소드예제3 {

	public static void main(String[] args) {

		// 정수형 num1 과 num2 를 입력 받으세요.
		// num1 과 num2 중 10 에 더 가까운 수를 반환하는 close10 메소드를 생성하세요.
		// 단, 두 숫자 모두 10 과의 차이가 같다면 0을 반환하세요!
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 2; i++) {
			System.out.print("정수 입력 : ");
			int num1 = sc.nextInt();
			System.out.print("정수 입력 : ");
			int num2 = sc.nextInt();
			int result = close10(num1, num2);
			System.out.println("10 에 가까운 수 : " + result);
		}
	}

	public static int close10(int num1, int num2) {
		int result = 0;
		int val1 = 10 - num1;
		int val2 = 10 - num2;
		if (val1 < 0) {
			val1 *= -1;
		} else if (val2 < 0) {
			val2 *= -1;
		} else if (val1 == val2) {
			result = 0;
		} else if (val1 > val2) {
			result = num2;
		} else if (val1 < val2) {
			result = num1;
		} else {
			result = '?';
		}
		return result;
	}

	// 풀이
	public static int answer(int num1, int num2) {
		// 두 수 중에서 10에 더 가까운 수를 구하기
		int a = 0;
		int b = 0;
		// num1 이 10 에서 얼마나 떨어져있는가?
		// 만약 num1 이 10 보다 크면 : num1 - 10
		// 그렇지 않다면 : 10 - num1
		if (num1 > 10) {
			a = num1 - 10;
		} else {
			a = 10 - num1;
		}

		// num2 가 10 에서 얼마나 떨어져있는가?
		// 만약 num2 가 10 보다 크면 : num2 - 10
		// 그렇지 않다면 : 10 - num2
		if (num2 > 10) {
			b = num2 - 10;
		} else {
			b = 10 - num2;
		}

		// 1 과 2 에서 구한 거리를 비교해서 누가 더 가까운지?
		// 만약 a > b : num1 이 더 멀다.
		// 만약 a < b : num2 가 더 멀다.
		// 만약 a == b : 둘이 떨어진 거리가 같다.
		int result = 0;

		if (a > b) {
			result = num2;
		} else if (a < b) {
			result = num1;
		} else {
			result = 0;
		}

		// 더 가까운 수를 반환
		// 만약 5 와 15 처럼 떨어진 거리가 같다면, 0 을 반환
		return result;

	}

}
