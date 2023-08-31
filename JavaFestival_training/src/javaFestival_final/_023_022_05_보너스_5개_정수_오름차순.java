package javaFestival_final;

import java.util.Scanner;

public class _023_022_05_보너스_5개_정수_오름차순 {

	public static void main(String[] args) {

		// 보너스 5번, 제한시간 : 15분, 획득점수 : 52점

		// 5개의 정수를 입력 받아
		// 오름차순 정렬하여 출력하는 프로그램을 구현하시오.
		Scanner sc = new Scanner(System.in);
		int[] array = new int[5];
		for (int i = 0; i < array.length; i++) {
			System.out.print(i + 1 + "번째 수 입력 : ");
			array[i] = sc.nextInt();
		}
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (i == j) {
					continue;
				} else if (array[i] < array[j]) {
					int tmp = array[j];
					array[j] = array[i];
					array[i] = tmp;
				}
			}
		}
		System.out.println("정렬 후");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
