package javaFestival_final;

import java.util.Scanner;

public class _004_거스름돈_지폐개수 {

	public static void main(String[] args) {

		// 4번, 제한시간 : 15분, 획득점수 : 10점

		// 거스름돈을 입력 받아 내어줘야 하는 지폐의 개수를 출력하는
		// 프로그램을 작성하시오.
		// 단, 최대단위는 10000원, 최소단위는 100원
		Scanner sc = new Scanner(System.in);
		System.out.print("총금액 입력 : ");
		int money = sc.nextInt();
		int m10000 = money / 10000;
		int m5000 = money % 10000 / 5000;
		int m1000 = money % 10000 % 5000 / 1000;
		int m500 = money % 10000 % 5000 % 1000 / 500;
		int m100 = money % 10000 % 5000 % 1000 % 500 / 100;
		System.out.println("잔돈 : " + money + "원");
		System.out.println();
		System.out.println("10000원 : " + m10000 + "개");
		System.out.println("5000원 : " + m5000 + "개");
		System.out.println("1000원 : " + m1000 + "개");
		System.out.println("500원 : " + m500 + "개");
		System.out.println("100원 : " + m100 + "개");
	}

}
