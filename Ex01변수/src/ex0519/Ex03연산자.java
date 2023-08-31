package ex0519;

import java.util.Scanner;

public class Ex03연산자 {

	public static void main(String[] args) {

		// 문자 + 숫자 가능 ( 10 + "7" = "107" )

		// 데이터를 입력받기
		Scanner sc = new Scanner(System.in);

		// 문자열을 입력받기
		// console 창에 입력한 데이터를 문자열 형태로 돌려줌
		System.out.print("문자열을 입력해주세요 >> ");
		String text = sc.next();

		// 숫자 입력가능
		System.out.print("input number >> ");
		int num = sc.nextInt();

		System.out.println(text);
		System.out.println(num);
	}

}
