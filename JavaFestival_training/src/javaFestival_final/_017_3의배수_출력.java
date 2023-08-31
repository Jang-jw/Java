package javaFestival_final;

import java.util.Scanner;

public class _017_3의배수_출력 {

	public static void main(String[] args) {

		// 17번, 제한시간 : 15분, 획득점수 : 30점

		// 숫자를 입력 받아 3의 배수인 숫자를
		// 출력하는 프로그램을 작성하세요.
		Scanner sc = new Scanner(System.in);

		int num = 0;
		int[] array = new int[10];
		for (int i = 0; i < array.length; i++) {
			System.out.print(i + 1 + "번 째 정수 입력>>");
			num = sc.nextInt();
			if (num % 3 == 0) {
				array[i] = num;
			}
		}
		System.out.print("3의 배수 : ");
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 0) {
				continue;
			}
			System.out.print(array[i] + " ");
		}
	}

}
