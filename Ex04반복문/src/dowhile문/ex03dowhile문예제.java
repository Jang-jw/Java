package dowhile문;

import java.util.Random;
import java.util.Scanner;

public class ex03dowhile문예제 {

	public static void main(String[] args) {

		// 1. 랜덤으로 정수 2개를 뽑아 문제를 출력하세요.
		// 2. 사용자로부터 두 수의 합을 입력 받으세요.
		// 3. 입력 받은 값이 두 수의 합과 일치하면 "성공!"
		// 그렇지 않은 경우 "실패.."를 출력해주세요.
		// 일치하지 않았을 때만 다시 실행할 것인지 물어보고
		// "Y" 를 입력하면 계속 실행,
		// "N" 를 입력하면 프로그램을 종료하세요.

		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		System.out.println("=====Plus Game=====");

		do {
			int num1 = ran.nextInt(10) + 1;
			int num2 = ran.nextInt(10) + 1;
			System.out.print(num1 + "+" + num2 + "=");
			int val = sc.nextInt();
			int result = num1 + num2;
			if (val != result) {
				System.out.println("Fail");
				System.out.print("계속 하시겠습니까? >> ");
				String an = sc.next();
				if (an.equals("Y") || an.equals("y")) {
					continue;
				} else if (an.equals("N") || an.equals("n")) {
					System.out.println("종료합니다.");
					break;
				} else {
					while (true) {
						System.out.print("잘 못 입력하셨습니다.. 계속 하시겠습니까? >> ");
						an = sc.next();
						if (an.equals("Y") || an.equals("y")) {
							break;
						} else if (an.equals("N") || an.equals("n")) {
							System.out.println("종료합니다.");
							break;
						}
					}
				}
				if (an.equals("N")) {
					break;
				}
			} else {
				System.out.println("Success");
				continue;
			}
		} while (true);

	}

}
