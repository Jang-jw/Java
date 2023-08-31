package while문;

import java.util.Scanner;

public class ex02while예제 {

	public static void main(String[] args) {

		// 1. 입력하는 도구 꺼내기 
		Scanner sc = new Scanner(System.in);

		int num = 0;
		while (num <= 10) {
			// 2. 정수 입력 출력하기  
			System.out.print("정수 입력 : ");
			// 3. 정수 입력 받기 
			num = sc.nextInt();
		}
		System.out.println("종료되었습니다.");

	}

}
