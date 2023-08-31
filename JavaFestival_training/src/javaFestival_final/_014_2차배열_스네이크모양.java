package javaFestival_final;

import java.util.Scanner;

public class _014_2차배열_스네이크모양 {

	public static void main(String[] args) {

		// 14번, 제한시간 : 15분, 획득점수 : 25점

		// 정수 N 을 입력받아
		// N * N 배열에 다음과 같이 숫자를 저장하고 출력하시오.
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		System.out.println();
		int[][] array = new int[num][num];
		int cnt = 1;
		for (int i = 0; i < array.length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < array[i].length; j++) {
					array[i][j] = cnt++;
				}
			} else {
				for (int j = 0; j < array[i].length; j++) {
					array[i][4 - j] = cnt++;
				}

			}
		}
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
