package restaurant;

public class Restaurant {

	// class : 객체를 만들기 위한 설계도이자 분류이다!
	// field : 객체의 상태나 속성을 나타낸다.
	// Method : 객체의 행동을 나타낸다!
	double area;
	String address;
	String brand;
	int money;

	public void makeHanburger(String stuff) {
		System.out.println(stuff + "햄버거 만들기");
	}

	public void calculate(int pay) {
		money += pay;
		System.out.println(pay + "원 계산하기");
	}
}
