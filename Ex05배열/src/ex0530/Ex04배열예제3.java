package ex0530;

import java.util.Random;

public class Ex04배열예제3 {

	public static void main(String[] args) {

		// 1. 정수형 5칸 배열 생성
		int[] numbers = new int[5];

		// 2. 배열 안에 있는 값을 1 ~ 10 사이의 수로 초기화
		// 단! 배열에 중복 X
		// --> 만약 중복이 발생하면? 다시 숫자를 뽑겠다.

		// 1 --> [ 10, ]
		// 2 --> [ 10, 5, ]
		// 3 --> [ 10, 5, 7 ]
		Random ran = new Random();

		// i = 3
		for (int i = 0; i < numbers.length; i++) {

			numbers[i] = ran.nextInt(10) + 1;

			// 중복 체크
			for (int j = 0; j < i; j++) {
				if (numbers[i] == numbers[j]) {
					i--;
				}
			}

		}

		// 배열 안의 데이터를 모두 출력
		// 이번주 출력번호는요...!!
		// 9, 1, 2, 4, 3
		System.out.println("이번주 출력번호는요...!!");
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");

		}

		System.out.println();

	}

}
