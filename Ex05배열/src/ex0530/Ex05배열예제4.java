package ex0530;

import java.util.Scanner;

public class Ex05배열예제4 {

	public static void main(String[] args) {

		// 배열 예제 - 수박게임
		// 1. 문자형 데이터를 저장할 수 있는 배열 array 를 선언 후
		// '수', '박' 으로 초기화하세요.
		// 2. 사용자로부터 숫자를 입력 받으세요.
		// 3. 입력 받은 개수만큼 '수', '박'을 순차적으로 출력하는 프로그램을 작성하세요.
		char[] data = { '수', '박' };
		Scanner sc = new Scanner(System.in);
		System.out.println("=====수박 게임 start~!=====");
		System.out.print("숫자를 입력하세요 >> ");
		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			// 만약 i 가 짝수라면, data[0] 출력
			// 홀수라면, data[1] 출력
			/*
			 * if (i % 2 == 0) { System.out.print(data[0]); // i = 0 } else {
			 * System.out.print(data[1]); // i = 1 }
			 */
			// i = 0, 0
			// i = 1, 1
			// i = 2, 0
			// ...
			System.out.print(data[i % 2]); // 코드 리펙토링~
		}

	}

}
