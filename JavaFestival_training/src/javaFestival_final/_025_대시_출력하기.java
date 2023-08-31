package javaFestival_final;

import java.util.Scanner;

public class _025_대시_출력하기 {

	public static void main(String[] args) {

		// 25번, 제한시간 : 25분, 획득점수 : 40점

		// 그림과 같이 대시('-') 문자로 구성된 형태의 숫자를
		// 주어진 숫자와 같이 출력하고 싶을때 사용되게 되는
		// 대시의 개수를 출력하는 프로그램을 작성하라.
		Scanner sc = new Scanner(System.in);
		System.out.print("첫자리 0을 제외한 숫자를 입력해주세요 >> ");
		String[] arrayStr = sc.next().split("");
		int _0 = 6, _1 = 2, _2 = 5, _3 = 5, _4 = 4, _5 = 5, _6 = 6, _7 = 3, _8 = 7, _9 = 6;
		int[] array = new int[arrayStr.length];
		int sum = 0;
		for (int i = 0; i < arrayStr.length; i++) {
			array[i] = Integer.parseInt(arrayStr[i]);
			if (array[i] == 0) {
				sum += _0;
			} else if (array[i] == 1) {
				sum += _1;
			} else if (array[i] == 2) {
				sum += _2;
			} else if (array[i] == 3) {
				sum += _3;
			} else if (array[i] == 4) {
				sum += _4;
			} else if (array[i] == 5) {
				sum += _5;
			} else if (array[i] == 6) {
				sum += _6;
			} else if (array[i] == 7) {
				sum += _7;
			} else if (array[i] == 8) {
				sum += _8;
			} else if (array[i] == 9) {
				sum += _9;
			}
		}
		System.out.println("대시('-')의 총 합 >> " + sum);
	}

}
