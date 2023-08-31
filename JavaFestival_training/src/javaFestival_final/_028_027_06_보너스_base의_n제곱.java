package javaFestival_final;

public class _028_027_06_보너스_base의_n제곱 {

	public static void main(String[] args) {

		// 보너스 6번, 제한시간 : 30분, 획득점수 : 60점 
		
		// 2개의 정수 base, n 을 받아 base 의 n 제곱 만큼
		// 값을 반환하는 powerN() 메소드를 작성하세요.
		int base = 2;
		int n = 3;
		int result = powerN(base, n);
		System.out.println("결과 확인 : " + result);
	}

	private static int powerN(int base, int n) {
		int result = 1;
		for (int i = 0; i < n; i++) {
			result = result * base;
		}
		return result;
	}

}
