package constructor;

public class Restaurant {

	String address;
	int money;

	// 생성자 만들기.
	// 생성자의 목적 : 객체생성에 필요한 초기작업을 수행하기 위해 사용
	// 생성자의 목적 2 : 필드의 초기값을 설정하기 위해 사용.

	public Restaurant() {
		System.out.println("기본생성자 초기작업이야!");
		address = "광주";
		money = 10000000;
	}

}
