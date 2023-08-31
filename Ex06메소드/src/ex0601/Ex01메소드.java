package ex0601;

import java.util.Random;

public class Ex01메소드 {

	// 메소드
	// void : 리턴을 하지 않겠다.
	public static void main(String[] args) {

		// 메서드를 실행
		// 메서드 이름을 호출
		// 매개변수에 알맞는 값을 집어넣기 (순서도 중요)

		Random ran = new Random();

		int num = ran.nextInt(10); // 방식이 동일함

		int result = addNumber(1, 10); // 매개변수와 동일한 종류와 숫자의 변수 입력

		System.out.println(result);

	}

	// 메소드 : 여러줄의 코드를 하나로 묶어놓은 것
	// 반복된 코드를 줄이고, 유지보수를 용이하게 하기 위해
	// public : 접근제한자... ( 객체지향 )
	// 리턴타입 : 메소드를 실행했을 때, 리턴하는 결과값의 자료형
	// 메소드 이름 : 메소드 이름은 소문자로 시작
	// 매개변수 : 메소드 실행에 필요한 입력값
	// return : 메소드 실행 결과 반환
	// static : 메모리에 상주시킴 ( 객체지향 사용시 생략 가능 )
	public static int addNumber(int num1, int num2) {

		System.out.println("두 수를 더하는 메소드 실행");

		int result = num1 + num2;

		return result;

	}

}
