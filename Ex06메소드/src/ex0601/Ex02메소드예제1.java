package ex0601;

public class Ex02메소드예제1 {

	public static void main(String[] args) {

		// 두수를 입력받아서 더한 결과를 출력하는 add 메서드 생성
		// 두수를 입력받아서 뺀 결과를 출력하는 add 메서드 생성
		// 두수를 입력받아서 곱한 결과를 출력하는 add 메서드 생성
		// 두수를 입력받아서 나눈 결과를 출력하는 add 메서드 생성

		add(3, 5);
		sub(3, 5);
		mul(3, 5);
		div(3, 5);

	}

	public static int add(int num1, int num2) {
		int result = num1 + num2;
		System.out.println(result);
		return result;
		// return 을 하려면 void 를 int 로 바꿔줘야함
		// return 은 결과값을 반환후 메서드 실행을 종료함
		// 항상 마지막에 return 이 위치함
		// return 은 메소드당 한번만 실행
		// if(result>5) {
		// return result;
		// }else {
		// return result * 10;
		// if 문을 사용하면 result 를 두 번 이상 적을 수 있다.
	}

	public static void sub(int num1, int num2) { // void 로 해봄
		int result = num1 - num2;
		System.out.println(result);
	}

	public static int mul(int num1, int num2) {
		int result = num1 * num2;
		System.out.println(result);
		return result; // return 추가
	}

	public static int div(int num1, int num2) {
		int result = num1 / num2;
		System.out.println(result);
		return result;
	}

}
