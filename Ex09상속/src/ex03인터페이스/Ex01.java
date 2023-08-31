package ex03인터페이스;

public interface Ex01 {

	// 추상클래스와 비슷
	// 어떠한 클래스들을 설계할 때,
	// 필수적인 내용을 명시하는 용도로 쓰인다.

	// interface 는 추상 메서드를 정의할 때
	// abstract 생략가능
	// interface 내에서는 메서드를 구현할 수 없다.

	// 변수 선언시, 상수로 적용
	// 그래서 값을 집어넣어야 한다.
	int a = 3;

	public void print();
}
