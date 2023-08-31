package javaFestival_final;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {// 입력된 문장에 포함된 알파벳의 빈도를
		// 대소문자 구별없이 구하는
		// 프로그램을 작성하시오.
		Scanner sc = new Scanner(System.in);
		System.out.print("입력>> ");
		String text = sc.nextLine();
		text = text.strip().replace(" ", "");
		String[] arrayText = text.split("");
		char[] arrayChar = text.toCharArray();
		for (int i = 0; i < arrayChar.length; i++) {
			System.out.print(arrayChar[i]);
		}
		System.out.println();
		char[] arrayAlpha = { 'a', 'A', 'b', 'B', 'c', 'C', 'd', 'D', 'e', 'E', 'f', 'F', 'g', 'G', 'h', 'H', 'i', 'I',
				'j', 'J', 'k', 'K', 'l', 'L', 'm', 'M', 'o', 'O', 'p', 'P', 'q', 'Q', 'r', 'R', 's', 'S', 't', 'T', 'u',
				'U', 'v', 'V', 'w', 'W', 'x', 'X', 'y', 'Y', 'z', 'Z' };
		int[] arrayResult = new int[25];
		for (int i = 0; i < arrayChar.length; i++) {
			for (int j = 0; j < arrayAlpha.length / 2; j += 2) {
				if (arrayChar[i] == arrayAlpha[j] || arrayChar[i] == arrayAlpha[j + 1]) {
					arrayResult[j / 2]++;
				}
			}
		}
		for (int i = 0; i < arrayResult.length; i++) {
			System.out.print(arrayAlpha[i * 2] + " : ");
			System.out.println(arrayResult[i]);
		}
	}

	public static int powerN(int base, int num) {
		if (num == 0)
			return 1;
		int sum = base;
		for (int i = 1; i < num; i++) {
			sum *= base;
		}
		return sum;
	}
}
