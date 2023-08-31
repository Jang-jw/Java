package ex0526;

import java.util.Arrays;
import java.util.Random;

public class Ex02배열예제2_중요 {

	public static void main(String[] args) {

		// 배열 예제 - 가장 큰 수 찾기
		// 1. 정수형 데이터 5개를 저장할 수 있는 배열 array 를 선언하세요.
		// 2. 배열 안의 모든 데이터를 임의의 값으로 초기화하세요. (1~10까지의 수)
		// 3. 배열 안의 데이터 중 가장 큰 값을 출력하세요.

		int[] array = new int[5];

		Random ran = new Random();

		int max = array[0]; // 최소값을 찾을 필요가 없이 첫번째 값을 입력

		System.out.print("배열 안에 들어있는 값 : ");
		for (int i = 0; i < array.length; i++) {
			array[i] = ran.nextInt(10) + 1;
			if (array[i] > max) {
				max = array[i];
			}
		}
		String text = Arrays.toString(array);
		System.out.print(text);
		System.out.print("가장 큰 값은 ");
		System.out.print(max);
		System.out.println("입니다.");

	}

}
