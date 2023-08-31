package ex01_Phone;

public class PhoneMain {

	public static void main(String[] args) {

		// 객체를 생성하기 위하여 필요한 것은 두가지!
		// 1. 객체를 생성하기 위한 실행 명령! -> main()
		// 2. 객체 생성을 위한 new 키워드 필수!!

		// Phone 이라는 설계도 (=클래스) 통하여
		// call() 와 message() 호출!

		// 1. 다중 상속을 지원하지 않는다.
		// 2. 상속의 횟수에 제한을 두지 않는다.
		// 3. 모든 클래스는 java.lang.Object 를 상속받는다.

		Phone phone = new Phone();
		phone.call();
		phone.message();

		System.out.println();

		SmartPhone smart = new SmartPhone();
		smart.call();
		smart.message();
		smart.wifi();
		phone.call();
		phone.message();

		System.out.println();

		// Upcasting : 하위 클래스가 상위 클래스 타입으로 변하는것
		Phone phone2 = new SmartPhone();
		phone2.call();
		phone2.message();

		System.out.println();

		// Downcasting : 업캐스팅 객체를 원래로 되돌리는 기법!
		SmartPhone phone3 = (SmartPhone) phone2;
		phone3.call();
		phone3.message();
		phone3.wifi();
		callM(phone);
		callM(smart);
	}

	public static void callM(Phone i) {
		i.call();
	}

}
