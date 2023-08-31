package javaFestival_final;

public class _028_2진수를_10진수로_변환 {

	public static void main(String[] args) {

		// 28번, 제한시간 : 30분, 획득점수 : 45점

		// 문자열 형태의 2진수를 입력받아
		// 10진수로 바꾸는 프로그램을 작성하시오.
		String str1 = "01001101";
		String str2 = "00101000";
		String str3 = "01011000";
		String[] arrayStr1 = str1.split("");
		String[] arrayStr2 = str2.split("");
		String[] arrayStr3 = str3.split("");
		int result1 = 0;
		int result2 = 0;
		int result3 = 0;
		for (int i = 0; i < arrayStr1.length; i++) {
			result1 += Integer.parseInt(arrayStr1[i]) * powerN(2, arrayStr1.length - 1 - i);
			result2 += Integer.parseInt(arrayStr2[i]) * powerN(2, arrayStr2.length - 1 - i);
			result3 += Integer.parseInt(arrayStr3[i]) * powerN(2, arrayStr3.length - 1 - i);
		}
		System.out.println(str1 + "(2)" + " = " + result1 + "(10)");
		System.out.println(str1 + "(2)" + " = " + result2 + "(10)");
		System.out.println(str1 + "(2)" + " = " + result3 + "(10)");
	}

	private static int powerN(int base, int n) {
		int result = 1;
		for (int i = 0; i < n; i++) {
			result *= base;
		}
		return result;
	}
}
