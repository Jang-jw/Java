package ex0602;

public class Member {

	// 필드
	String name;
	String id;
	int age;

	// 기능 (메소드)
	public void message() {
		System.out.println(name + "가 메세지를 보냄!");
	}

	public void login() {
		System.out.println(name + "님 환영합니다.");
	}

	public void giftcon() {
		System.out.println(name + "님이 기프트콘을 보냈습니다.");
	}
}
