package javaFestival_final;

import java.util.Random;

public class _018_로또_중복제거 {

	public static void main(String[] args) {

		// 18번, 제한시간 : 15분, 획득점수 : 30점

		// 중복이 없이 숫자를 뽑는 로또 프로그램을 만드시오.
		Random ran = new Random();
		int[] array = new int[6];
		for (int i = 0; i < array.length; i++) {
			array[i] = ran.nextInt(45) + 1;
			for (int j = 0; j < array.length; j++) {
				if (i == j) {
					continue;
				}
				if (array[i] == array[j]) {
					i--;
				}
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println("행운의숫자 : " + array[i]);
		}

	}

}
