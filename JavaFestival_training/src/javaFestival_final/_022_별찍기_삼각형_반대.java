package javaFestival_final;

public class _022_별찍기_삼각형_반대 {

	public static void main(String[] args) {

		// 22번, 제한시간 : 17분, 획득점수 : 35점

		// 다음과 같은 결과를 출력하세요
		// &&&&*
		// &&&**
		// &&***
		// &****
		// *****
		for (int i = 1; i < 6; i++) {
			for (int j = 1; j < 6 - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
