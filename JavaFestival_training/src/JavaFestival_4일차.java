import java.util.Scanner;

public class JavaFestival_4일차 {

	public static void main(String[] args) {

		// 행 개수를 입력받아 다음과 같이 삼각형을 출력하시오.
		// 행 개수 : 8
		// *
		// **
		// ***
		// ****
		// *****
		// ******
		// *******
		// ********
		Scanner sc = new Scanner(System.in);
		System.out.print("행 개수 : ");
		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

		// 행 개수를 입력받아 다음과 같이 삼각형을 출력하시오.
		// 행 개수 : 7
		// *******
		// ******
		// *****
		// ****
		// ***
		// **
		// *
		System.out.print("행 개수 : ");
		num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

		// 다음과 같은 결과를 출력하세요.
		// *
		// **
		// ***
		// ****
		// *****
		num = 5;
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num - 1 - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < i + 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

	}

}
