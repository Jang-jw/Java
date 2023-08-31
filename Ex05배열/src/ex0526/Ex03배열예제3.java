package ex0526;

import java.util.Random;

public class Ex03배열예제3 {

	public static void main(String[] args) {

		// 배열 예제 - 로또 번호 추첨 (level up!)
		// 1. 정수형 데이터 5개를 저장할 수 있는 배열 array 를 선언하세요.
		// 2. 배열 안의 데이터를 모두 임의의 값으로 초기화하세요. (1~10 까지의 수)
		// 3. 단, 배열에 중복된 값을 제거해 주세요.
		// 4. 배열 안의 데이터를 모두 출력해주세요.

		Random ran = new Random();

		int[] array = new int[5];

		System.out.println("=====로또타임=====");
		System.out.println("이번주 출력번호는요...!! 두구두구두구!!!!");
		for (int i = 0; i < array.length; i++) {
			array[i] = ran.nextInt(10) + 1;
			for (int j = 0; j < i; j++) {
				if (array[j] == array[i]) {
					i--;
				}
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
