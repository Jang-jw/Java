package javaFestival_final;

import java.util.Random;

public class _010_가장큰수_가장작은수 {

	public static void main(String[] args) {

		// 10번, 제한시간 : 13분, 획득점수 : 20점

		// 8칸 크기의 배열을 선언하고 랜덤수로 초기화 한 후
		// 가장 큰 수와 작은 수를 각각 출력하시오.
		int[] array = new int[8];
		Random ran = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = ran.nextInt(1, 100) + 1;
			for (int j = 0; j < array.length; j++) {
				if (i == j) {
					continue;
				} else if (array[i] == array[j]) {
					i--;
				}
			}
		}
		int max = array[0];
		int min = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			} else if (array[i] < min) {
				min = array[i];
			}
		}
		System.out.print("배열에 있는 모든 값 : ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		System.out.println("가장 큰 값 : " + max);
		System.out.println("가장 작은 값 : " + min);
	}

}
