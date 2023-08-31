package javaFestival_final;

public class _017_016_03_보너스_op에_맞게_연산하는_메소스 {

	public static void main(String[] args) {

		// 보너스 3번, 제한시간 : 15분, 획득점수 : 37점

		// num1, num2, op(+,-,*,/) 를 매개변수로 받아
		// num1 과 num2 를 op 에 맞게 연산한 결과값을 반환해주는
		// cal 메소드를 작성하세요.
		int num1 = 50;
		int num2 = 15;
		char op = '-';
		System.out.println(cal(num1, num2, op));
		num1 = 50;
		num2 = 15;
		op = '*';
		System.out.println(cal(num1, num2, op));
	}

	private static int cal(int num1, int num2, char op) {
		int result = 0;
		if (op == '-') {
			result = num1 - num2;
		} else if (op == '+') {
			result = num1 + num2;
		} else if (op == '*') {
			result = num1 * num2;
		} else if (op == '/') {
			result = num1 / num2;
		} else {
			result = '?';
		}
		return result;
	}

}
