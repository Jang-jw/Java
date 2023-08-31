package 통장관리프로그래밍;

import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {

		// 실행공간
		// BankBook 자료형 b1 객체 생성
		// 1. BankBook 설계도를 기반으로 b1 객체 생성
		// 자료형 객체명 = new 자료형();
		// 자료형 ---> 클래스명
		Bankbook b1 = new Bankbook();
		System.out.println(b1);

		// 2. b1 에 입금
		Scanner sc = new Scanner(System.in);
		System.out.print("입금할 금액 입력 >> ");
		b1.deposit(sc.nextInt());
		// 3. 현재 잔액 출력
		b1.showMoney();

		// 4. b1 에 인출
		System.out.print("출금할 금액 입력 >> ");
		b1.withdraw(sc.nextInt());
		// 5. 현재 잔액 출력
		b1.showMoney();

		// System.out.println(b1.money);
		// 보안상 취약 보완위해 클래스에서 private 를 변수에 적용

	}

}
