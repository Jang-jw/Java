package javaFestival_final;

import java.util.Scanner;

public class _001_목표_몸무게_달성_축하 {

	public static void main(String[] args) {

		// 1번, 제한시간 : 8분, 획득점수 : 10점

		// 현재 몸무게와 목표 몸무게를 각각 입력 받고
		// 주차 별 감량 몸무게를 입력 받아 목표 달성 시
		// 축하 메세지를 띄우는 프로그램을 구현하시오.
		Scanner sc = new Scanner(System.in);
		System.out.print("현재몸무게 : ");
		int weightNow = sc.nextInt();
		System.out.print("목표몸무게 : ");
		int weightTarget = sc.nextInt();
		int cnt = 0;
		while (weightNow > weightTarget) {
			cnt++;
			System.out.print(cnt + "주차 감량 몸무게 : ");
			int weightWeek = sc.nextInt();
			weightNow -= weightWeek;
		}
		System.out.println(weightNow + "kg 달성!! 축하합니다!");
	}
}
