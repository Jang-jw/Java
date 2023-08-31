package while문;

import java.util.Scanner;

public class ex04while예제 {

	public static void main(String[] args) {

		// 숫자를 입력 받아 홀수와 짝수가 각각 몇 개 입력되었는지
		// 출력하는 프로그램을 작성하세요.
		// -1 을 입력한 경우 프로그램 종료

		Scanner sc = new Scanner(System.in);

		int even = 0;
		int odd = 0;

		while (true) {
			System.out.print("숫자 입력 : ");
			int num = sc.nextInt();

			if (num % 2 == 0) {
				even++;
			} else if (num == -1) {
				System.out.println("종료되었습니다.");
				break;
			} else {
				odd++;
			}
			System.out.println("짝수개수 : " + even);
			System.out.println("홀수개수 : " + odd);

		}

	}

}
