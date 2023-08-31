package ex0601;

import java.util.Scanner;

public class Ex05완전수찾기 {

	public static void main(String[] args) {

		// 완전수
		// 자기 자신을 제외한 약수들의 합이 자기자신과 같은 수
		// 6 의 약수 : 1,2,3,6
		// 1+2+3=6 : 완전수
		// 10 의 약수 : 1,2,5,10
		// 1+2+5=8 : 비 완전수

		// num2 가 num1 의 약수인지 확인하여
		// 약수라면 true, 아니라면 false 를 반환하는
		// isDivisor 메소드를 만들어주세요.
		for (int i = 0; i < 2; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.print("num1 입력 : ");
			int num1 = sc.nextInt();
			System.out.print("num2 입력 : ");
			int num2 = sc.nextInt();
			boolean divisor = isDivisor(num1, num2);
			System.out.println(divisor);
			System.out.println();

		}
		// 자신을 제외한 약수의 총합을 구하는 getSum 메소드를 작성하세요.
		System.out.println(getSum(7));
		System.out.println(getSum(44));
		System.out.println();

		// 입력받은 매개변수가 완전수라면 true
		// 아니라면 false 를 반환하는
		// isPerfect 메소드를 생성하세요.
		System.out.println(isPerfect(7));
		System.out.println(isPerfect(6));
	}

	public static boolean isDivisor(int num1, int num2) {
		boolean result;
		if (num1 % num2 == 0) {
			result = true;
		} else {
			result = false;
		}
		return result;
	}

	// 풀이
	// 접근제한자 privte : 이 클래스 안에서만 사용 가능!
	// 1. 약수 찾기 메소드
	private static boolean answer(int num1, int num2) {
		boolean result = false;
		// num2 가 num1 의 약수이니?
		if (num1 % num2 == 0) {
			// num2 가 num1 의 약수 일 때
			result = true;

		}
		return result;
	}

	private static int getSum(int num) {
		int result = 0;
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				result += i;
			}
		}
		return result;
	}

	// 풀이
	// 자신을 제외한 약수의 총합을 구하는 메소드
	private static int answer2(int num) {
		int result = 0;
		// 매개변수로 입력된 숫자의 약수를 구한다.
		// --> 1~num 까지 숫자중에서 num 을 제외한 범위
		for (int i = 1; i < num; i++) {
			// ** 기존 로직
//			if (num % i == 0) {
//				// i 는 num 의 약수!
//				// 나 자신을 제외한 약수들의 합을 구한다.
//				result += i;
//			}

			// *** 메소드를 호출한 로직
			// 메소드 구조 안에서 메소드를 새롭게 구현할 수는 없으나
			// 메소드 자체를 호출하여 사용하는 것은 가능하다!
			if (isDivisor(num, i)) { // i 가 num 의 약수가 맞다면 => true
				// i 는 num 의 약수
				// i 의 누적 합계
				result += i;
			}

		}
		return result;
	}

	private static boolean isPerfect(int num) {
		boolean result = false;
		if (getSum(num) == num) {
			result = true;
		}

		return result;
	}

	// 풀이
	private static boolean answer3(int num) {
		boolean result = false;
		// num 이라는 숫자의 약수의 합이랑 num 이 같은지 확인
		// 같다 => 완전수 => true
		if (getSum(num) == num) {
			// num 은 완전수!!!
			result = true;
		}

		return result;
	}

}
