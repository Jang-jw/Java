package javaFestival_final;

import java.util.Random;
import java.util.Scanner;

public class _029_랜덤정수_2개_더하기_게임 {

	public static void main(String[] args) {

		// 29번, 제한시간 : 30분, 획득점수 : 45점

		// 랜덤으로 정수 2개를 뽑아 아래와 같이 출력
		// 사용자는 두 수의 합을 입력
		// 두 수의 합과 입력한 수가 일치하면 "Success"
		// 두 수의 합과 입력한 수가 일치하지 않으면 "Fail"을 출력
		// 기회는 5번! 5번 틀리면 GAME OVER
		Scanner sc = new Scanner(System.in);
		while (true) {
			Random ran = new Random();
			int ranNum1 = ran.nextInt(10);
			int ranNum2 = ran.nextInt(10);
			System.out.print(ranNum1 + " + " + ranNum2 + " = ");
			int numInt = sc.nextInt();
			if (numInt == (ranNum1 + ranNum2)) {
				System.out.println("SUCCESS!");
			} else {
				System.out.println("Fail...");
				System.out.println("GAME OVER!");
				break;
			}
		}
	}

}
