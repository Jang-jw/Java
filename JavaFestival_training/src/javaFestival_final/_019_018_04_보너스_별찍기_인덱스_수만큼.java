package javaFestival_final;

import java.util.Scanner;

public class _019_018_04_보너스_별찍기_인덱스_수만큼 {

	public static void main(String[] args) {

		// 보너스 4번, 제한시간 : 17분, 획득점수 : 45점

		// 사용자에게 입력받아 배열의
		// 인덱스의 수 만큼 별을 출력해보세요.
		Scanner sc = new Scanner(System.in);
		int[] numbers5 = new int[5];
		for (int i = 0; i < numbers5.length; i++) {
			System.out.print(i + "번째 별의 수 : ");
			numbers5[i] = sc.nextInt();
		}
		for (int i = 0; i < numbers5.length; i++) {
			System.out.print(numbers5[i] + ":");
			for (int j = 0; j < numbers5[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
