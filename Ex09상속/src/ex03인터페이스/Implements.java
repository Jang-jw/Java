package ex03인터페이스;

public class Implements implements Ex01, Ex02 {

	@Override
	public void show() {
	}

	@Override
	public void print() {
	}

	// 이 클래스 파일이 ex01 Interface 를 구현했으면 좋겠다.
	// >> implements 키워드를 이용해서 interface 를 구현

	// interface 내에 있는 추상메서드를 반드시 구현해야함

	// 상속 --> 부모 클래스가 반드시 1개
	// interface --> 여러개의 interface 를 동시에 구현할 수 있다.
	// 우리한테 필요한 interface 들을 모아서
	// 하나의 class 를 구현하는데 사용할 수 있다.
}
