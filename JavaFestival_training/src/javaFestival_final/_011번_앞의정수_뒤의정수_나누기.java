package javaFestival_final;

public class _011번_앞의정수_뒤의정수_나누기 {

	public static void main(String[] args) {

		// 11번, 제한시간 : 15분, 획득점수 : 20점

		// 두 개의 정수를 매개변수로 받아
		// 앞의 정수가 뒤의 정수로 나누어지는지를 판별하는 메소드 isDivide() 를
		// 작성하세요. 이때, 나누어지면 true
		// 나누어지지 않으면 false 를 반환함.
		int num1 = 10;
		int num2 = 2;
		boolean result = isDivide(num1, num2);
		System.out.println("결과 확인 : " + result);

	}

	private static boolean isDivide(int num1, int num2) {
		boolean result = false;
		if (num1 % num2 == 0) {
			result = true;
		}

		return result;
	}

}
