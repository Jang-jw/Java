package 삼항연산자;

import java.util.Scanner;

public class ex03삼항연산자 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 정수 입력: ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수 입력: ");
		int num2 = sc.nextInt();
		int result = num1 > num2 ? 
				num1 - num2 :
				num2 - num1;
		System.out.println("두수의 차 : "+result);

		System.out.print("첫 번째 정수 입력: ");
		num1 = sc.nextInt();
		System.out.print("두 번째 정수 입력: ");
		num2 = sc.nextInt();
		result = num1 > num2 ? 
				num1 - num2 :
				num2 - num1;
		System.out.println("두수의 차 : "+result);
		
		
		
		
	}

}
