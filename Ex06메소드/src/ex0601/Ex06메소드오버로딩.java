package ex0601;

public class Ex06메소드오버로딩 {

	public static void main(String[] args) {

		// 메소드 오버로딩 ( =중복정의 )
		// 매개변수의 개수를 다르게하고, 메소드 이름은 똑같이 부여
		System.out.println(add(3, 5));
		System.out.println(add(3.5, 5.5));
		System.out.println(add(3, 5, 8));

	}

	// 메소드 오버로딩 성립 조건
	// 1. 이름이 같아야 한다.
	// 2. 매개변수의 개수 또는 자료형 ( 데이터타입 ) 이 달라야 한다.
	// 3. 매개변수와 메소드 이름이 동일하고 리턴타입만 다른 경우는 오버로딩 아니다.

	private static double add(double num1, double num2) {
		return num1 + num2;
	}

	private static int add(int num1, int num2) {
		return num1 + num2;
	}

	// 매개변수 개수를 틀리게 오버로딩
	private static int add(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}

}
