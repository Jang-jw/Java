package javaFestival_final;

import java.util.Scanner;

public class _008_1의자리_반올림 {

	public static void main(String[] args) {

		// 8번, 제한시간 : 8분, 획득점수 : 20점

		// 정수를 입력받아
		// 1의 자리에서 반올림 한 결과를 출력하시오.
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		num = num % 10 < 5 ? num / 10 * 10 : (num / 10 + 1) * 10;
		System.out.println("반올림 수 : " + num);
	}

}
