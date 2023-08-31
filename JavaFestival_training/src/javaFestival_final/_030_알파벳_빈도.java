package javaFestival_final;

import java.util.Scanner;

public class _030_알파벳_빈도 {

	public static void main(String[] args) {

		// 30번, 제한시간 : 30분, 획득점수 : 45점

		// 입력된 문장에 포함된 알파벳의 빈도를
		// 대소문자 구별없이 구하는
		// 프로그램을 작성하시오.
		Scanner sc = new Scanner(System.in);
		System.out.print("입력>> ");
		String[] array = sc.nextLine().split("");
		String[] arrayAlpha1 = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q",
				"r", "s", "t", "u", "v", "w", "x", "y", "z" };
		String[] arrayAlpha2 = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q",
				"R", "S", "t", "u", "v", "w", "x", "y", "z" };
		int[] arrayResult = new int[arrayAlpha1.length];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < arrayAlpha1.length; j++) {
				if (array[i].equals(arrayAlpha1[j]) || array[i].equals(arrayAlpha2[j])) {
					arrayResult[j]++;
				}
			}
		}
		for (int i = 0; i < arrayResult.length; i++) {
			System.out.print(arrayAlpha1[i] + " : ");
			System.out.println(arrayResult[i]);
		}
	}
}
