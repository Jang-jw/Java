package ex0518;

public class Ex02자료형 {

	public static void main(String[] args) {

		// ===== 기본 자료형 =====
		// 1. 논리 자료형 : 참 or 거짓을 저장할 수 있는 자료형
		boolean bool;
		bool = true; // 또는 false

		// 2. 문자 자료형 : 아스키코드표를 이용해 변환해서 저장
		char c;
		c = 'A' + 1; // 97
		System.out.println(c);

		// 3. 정수형
		byte b = 100; // 1byte : -128 ~ 127

		short s = 2023; // 2byte

		// 기본!!
		int i = 10000000; // 4byte

		// 기본인 int 로 적용되기 때문에, 반드시 숫자 끝에 1을 붙여야한다.
		long l = 7000000000l; // 8byte

		// 4. 실수형
		// 기본인 double 로 적용이 되므로, 숫자 뒤에 f 를 붙여야 한다.
		float f = 3.14f; // 4byte

		// 기본!!
		double d = 3.14; // 8byte

		// ===== 참조자료형 =====

		// 문자열 ("")
		String str = "hello world"; // 길이 제한 없음

		// 캐스팅(형변환)
		// 1. 자동형변환 : 상대적으로 작은 자료형에서 큰 자료형으로 변환될때

		int num = 10;

		double num2 = num;

		// 2. 강제형변환 : 상대적으로 큰 자료형에서 작은 자료형으로 변환될때

		double pie = 3.14;

		int p = (int) pie; // 소숫점 이하는 삭제됨
		System.out.println(p);
	}

}
