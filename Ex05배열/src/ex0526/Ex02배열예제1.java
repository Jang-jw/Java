package ex0526;

import java.util.Arrays;
import java.util.Random;

public class Ex02배열예제1 {

	public static void main(String[] args) {
		
		// 1. 정수형 데이터 5개를 저장할 수 있는 배열 array 를 선언하세요.
		// 2. 배열 안의 모든 데이터를 임의의 값으로 초기화하세요. (1~100까지의 수)
		// 3. 배열 안의 데이터 중 홀수의 값만 출력하고, 총 몇 개인지 출력하세요. 

		Random ran = new Random();

		int[] array = new int[5];
		int cnt = 0; // 변수 선언할 때, 위치를 잘 확인할 것 --> 지역변수 확인 

		System.out.print("array에 들어있는 홀수는 ");
		for (int i = 0; i < array.length; i++) {
			array[i] = ran.nextInt(100) + 1;
			if (array[i] % 2 == 1) {
				System.out.print(array[i] + " ");
				cnt++;
			}
		}
		System.out.println("이며,");
		System.out.println("총 " + cnt + "개 입니다.");

	}

}
