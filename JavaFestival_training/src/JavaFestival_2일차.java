import java.util.Random;
import java.util.Scanner;

public class JavaFestival_2일차 {

	public static void main(String[] args) {

		// 현재 몸무게와 목표 몸무게를 각가 입력 받고
		// 주차 별 감량 몸무게를 입력 받아 목표 달성 시
		// 축하 메세지를 띄우는 프로그램을 구현하시오.

		Scanner sc = new Scanner(System.in);

		// 1번
		int totalWeight = 0;
		System.out.print("현재몸무게 : ");
		int currentWeight = sc.nextInt();
		System.out.print("목표몸무게 : ");
		int targetWeight = sc.nextInt();
		int num = 0;
		while (true) {
			++num;
			System.out.print(num + "주차 감량 몸무게 : ");
			int weekWeight = sc.nextInt();
			currentWeight -= weekWeight;
			if (currentWeight < targetWeight) {
				System.out.println(currentWeight + "kg 달성!! 축하합니다!");
				break;
			}
		}

		// 다음과 같은 프로그램을 작성하시오. 
		// A, B 숫자를 입력 받는다. 
		// A-B 를 출력한다. 
		// A와 B가 모두 0을 입력 받으면 프로그램이 종료된다. 
		while (true) {
			System.out.print("A 입력 >> ");
			int A = sc.nextInt();
			System.out.print("B 입력 >> ");
			int B = sc.nextInt();
			if (A == 0) {
				if (B == 0) {
					break;
				}
			}
			System.out.println("결과 >> " + (A + B));
		}

		// 랜덤으로 정수 2개를 뽑아 아래와 같이 출력
		// 사용자는 두 수의 합을 입력
		// 두 수의 합과 입력한 수가 일치하면 "Success"
		// 두 수의 합과 입력한 수가 일치하지 않으면 "Fail"을 출력
		// 기회는 5번! 5번 틀리면 GAME OVER 
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
