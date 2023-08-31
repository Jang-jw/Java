package 다중if문;

import java.util.Scanner;

public class ex02다중if문 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int totalScore = 0;
//		int i = 0;
//		while (true) {
//			++i;
//			System.out.print("점수 입력 : ");
//			totalScore = sc.nextInt();
//			
//			if (totalScore >= 90) {
//				System.out.println("A학점입니다!");
//			} else if (90 > totalScore && totalScore >= 80) {
//				System.out.println("B학점입니다!");
//			} else if (80 > totalScore && totalScore >= 70) {
//				System.out.println("C학점입니다!");
//			} else if (70 > totalScore) {
//				System.out.println("D학점입니다!");
//			}
//		}
		
		// 풀이 
		System.out.print("Score : ");
		totalScore = sc.nextInt();
		char grade = 'A';
		
		if (totalScore >= 90) {
			grade = 'A';
		} else if (totalScore >=80) {
			grade = 'B';
		} else if (totalScore >= 70) {
			grade = 'C';
		} else {
			grade = 'D';
		}
		System.out.println("Grade : "+grade);
		
	}

}
