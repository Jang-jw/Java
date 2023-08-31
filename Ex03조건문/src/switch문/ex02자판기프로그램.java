package switch문;

import java.util.Scanner;

public class ex02자판기프로그램 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 예제 1
		System.out.print("금액을 입력하세요 >> ");
		int cash = sc.nextInt();
		
		System.out.print("메뉴를 고르세요. " + "1.이구동성(700원) 2.썬칩(1000원) 3.뽀빠이(500원) >> ");
		int menu = sc.nextInt();

		int total = cash;

		if (menu == 1) {
			total = cash - 700;
		} else if (menu == 2) {
			total = cash - 1000;
		} else if (menu == 3) {
			total = cash - 500;
		} else {
			System.out.println("잘 못 누르셨습니다.");
		}
		if (total < 0) {
			total = cash;
			System.out.println("돈이 부족해요 ㅠㅠ");
		}
		System.out.println("잔돈 : " + total);
		System.out.print("천원 : " + total/1000 + "개, ");
		System.out.print("오백원 : " + total%1000/500 + "개, ");
		System.out.print("백원 : " + total%1000%500/100 + "개");
	}

}
