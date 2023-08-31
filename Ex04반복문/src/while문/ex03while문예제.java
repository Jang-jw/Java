package while문;

import java.util.Scanner;

public class ex03while문예제 {
	
	public static void main(String[] args) {
		
		// while문을 사용하여 키보드로부터 입력 받은 수를 
		// 누적하는 프로그램을 작성하세요.
		// -1 을 입력한 경우 프로그램 종료  
		
		Scanner sc = new Scanner(System.in);
		
		int total = 0;
		while (true) {
			System.out.print("정수 입력 : ");
			int num = sc.nextInt();
			total += num; // 복합대입연산자 
			System.out.println("누적결과 : " + total);
			if (num == -1) {
				System.out.println("종료되었습니다.");
				break;
			}
		}
		
		
		
		
	}

}
