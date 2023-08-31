package javaFestival_final;

import java.util.Scanner;

public class _002_시급_계산기 {

	public static void main(String[] args) {

		// 2번, 제한시간 : 8분, 획득점수 : 10점

		// 일한 시간을 입력받아 총 임금을 계산하는 시급계산기 입니다.
		// 시급은 5000원이며 8시간보다 초과 근무한 시간에 대해
		// 1.5배의 시급이 책정됩니다.
		Scanner sc = new Scanner(System.in);
		System.out.print("일한 시간을 입력하세요 : ");
		double time = sc.nextInt();
		if (time > 8) {
			time = (time - 8) * 1.5 + 8;
		}
		int result = (int) time * 5000;
		System.out.println("총 임금은 " + result + "원 입니다.");
	}

}
