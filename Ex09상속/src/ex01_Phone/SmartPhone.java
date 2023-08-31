package ex01_Phone;

public class SmartPhone extends Phone {

	// 오버 라이딩 (= 재정의 )
	// 부모 클래스가 가지고 있는 메소드를
	// 그대로 자식 클래스가 가져와
	// 로직에 대한 내용만 새롭게 정의하는 기법!

	// 중요!) 메소드의 이름 같아야 하고,
	// 메소드의 구조 ( 리턴 타입, 매개변수 타입 ) 가
	// 같아야 한다.
	// 매소드 안의 로직만 바뀐다.
	public void call() {
		System.out.println("영상통화 전화걸기");
	}
//
//	public void message() {
//		System.out.println("메세지보내기");
//	}

	public void wifi() {
		System.out.println("wifi~");
	}
}
