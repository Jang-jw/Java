import java.util.Scanner;

public class JavaFestival_1일차 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 일한 시간을 입력받아 총 임금을 계산하는 시급계산기입니다. 
		// 시급은 5000원이며 8시간보다 초과 근무한 시간에 대해
		// 1.5배의 시급이 책정됩니다. 
		double result = 0;
		System.out.print("일한시간을 입력하세요 : ");
		int time = sc.nextInt();
		if (time > 8) {
			result = ((time - 8) * 1.5 + 8) * 5000;
		} else {
			result = time * 5000;
		}
		System.out.println("총 임금은 " + (int) result + "원 입니다.");

		// 거스름돈을 입력받아 내어줘야 하는 지폐의 개수를 출력하는
		// 프로그램을 작성하시오.
		result = 0;
		System.out.print("총금액 입력 : ");
		int money = sc.nextInt();

		int m10000 = money / 10000;
		int m5000 = money % 10000 / 5000;
		int m1000 = money % 10000 % 5000 / 1000;
		int m500 = money % 10000 % 5000 % 1000 / 500;
		int m100 = money % 10000 % 5000 % 1000 % 500 / 100;

		System.out.println("잔돈 : " + money + "원");
		System.out.println("10000원 : " + m10000 + "개");
		System.out.println("5000원 : " + m5000 + "개");
		System.out.println("1000원 : " + m1000 + "개");
		System.out.println("500원 : " + m500 + "개");
		System.out.println("100원 : " + m100 + "개");
		
		// 정수를 입력받아 1의 자리에서 반올림 한 결과를 출력하시오. 
		System.out.print("숫자 입력 : ");
		result = sc.nextDouble();
		int total = 0;
		int remainder = (int)result % 10;
		if (remainder < 5) {
			remainder = 0;
			total = (int)result / 10 * 10; 
		} else {
			total = (int)result / 10 * 10 + 10;
		}
		System.out.println("반올림 수 : " + total);
		
		// 4번 
		System.out.print("첫 번째 숫자 입력 >> ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 입력 >> ");
		int num2 = sc.nextInt();
		int total1 = num1 * (num2 % 10);
		int total2 = num1 * (num2 % 100 / 10);
		int total3 = num1 * (num2 / 100);
		System.out.println(total1);
		System.out.println(total2);
		System.out.println(total3);
		total = total1 + total2 * 10 + total3 * 100;
		System.out.println(total);
		

	}

}
