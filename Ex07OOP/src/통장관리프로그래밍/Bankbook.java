package 통장관리프로그래밍;

public class Bankbook {

	// 통장 자료형의 설계도
	// 1. 필드
	private int money;
	// private --> 외부 클래스에서 접근 불가능하게 하는 접근제한자!!
	// --> 캡슐화 (정보은닉) 을 지켜주기위해서 사용하는 키워드

	// 2. 메소드
	// 입금
	public void deposit(int money) {
		this.money += money;
		// this : 현재 내 클래스 자체를 의미함
	}

	// 출금
	public void withdraw(int money) {
		this.money -= money;
	}

	// 잔액보기
	public void showMoney() {
		System.out.println("잔액 : " + money + "원");
	}

}