package ifelse문;

import java.util.Scanner;

public class ex03ifelse문 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("=====에버랜드에 오신 걸 환영합니다!=====");
		
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		System.out.print("인원수를 입력하세요 : ");
		int num = sc.nextInt();
		
		int result = 0; // 전역변수로 선언, 0 으로 초기화! 
		
		if (age < 20) {
			// result = num * 5000 / 2;
			result = (int)(num * 5000 * 0.5); // int 로 '강제 형변환' 
		} else {
			result = num * 5000;
		}
		System.out.println("입장료는 "+result+"원 입니다.");
		
		
		
	}

}
