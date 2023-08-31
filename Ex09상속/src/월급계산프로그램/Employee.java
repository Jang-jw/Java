package 월급계산프로그램;

// 추상 클래스
public abstract class Employee {

	// public : 모든! 같은 프로젝트 내라면 누구나!
	// protected : 패키지 내에서와 패키지 밖에서 상속관계에 있는 경우
	// default : 패키지 내에서
	// private : 하나의 파일 내에서

	protected String empno;
	protected String name;
	protected int pay;

	// 추상 메서드
	public abstract int getMoneyPay();
	/*
	 * RegularEmployee, TempEmployee
	 */

	public abstract String print();
}
