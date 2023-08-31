package dowhile문;

import java.util.Scanner;

public class ex02dowhile문예제 {

	public static void main(String[] args) {

		// 1. 현재 몸무게와 목표 몸무게를 입력 받으세요.
		// 2. 주차별 감량 몸무게를 입력 받으세요.
		// 3. 현재 몸무게가 목표 몸무게에 달성하면 축하한다는
		// 문구를 출력하고 종료시켜주세요.

		Scanner sc = new Scanner(System.in);

		System.out.print("현재몸무게 : ");
		int currentWeigth = sc.nextInt();
		System.out.print("목표몸무게 : ");
		int targetWeigth = sc.nextInt();
		int num = 0;
		do {
			++num;
			System.out.print(num + "주차 감량 몸무게 : ");
			int loseWeight = sc.nextInt();
			currentWeigth -= loseWeight;
		} while (currentWeigth > targetWeigth);
		System.out.println(currentWeigth + "kg 달성!! 축하합니다!!");

	}

}
