package 다중if문;

import java.util.Scanner;

public class ex01다중if문 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		for (int i=0; i<3; ++i) {

			System.out.print("숫자를 입력하세요 >> ");
			int num = sc.nextInt();
			
			if (num == 0) {
				System.out.println("0입니다.");
			} else if (num % 2 == 0) {
				System.out.println("짝수입니다.");
			} else if (num % 2 != 0) {
				System.out.println("홀수입니다.");
			} else {
				System.out.println("넌 누구니? ㅎ");
			}
		}
		
		
		
		
		
	}

}
