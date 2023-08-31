import java.util.Arrays;
import java.util.Scanner;

public class JavaFestival_3일차 {

	public static void main(String[] args) {

		// 1 -2 +3 -4 +...+99 -100 을 계산하여
		// 답을 출력하시오.
		int sum = 0;
		int num = 0;
		for (int i = 1; i < 101; i++) {
			if (i % 2 == 0) {
				num = i * -1;
			} else {
				num = i * 1;
			}
			sum += num;
			System.out.print(num + " ");
		}
		System.out.println();
		System.out.println("결과: " + sum);
		System.out.println();

		// (77*1)+(76*2)+(75*3)+...+(1*77) 를 계산하여
		// 결과를 출력하시오.
		num = 0;
		sum = 0;
		for (int i = 77; i > 0; i--) {
			num = i * (78 - i);
			sum += num;
		}
		System.out.print(sum);
		System.out.println();
		System.out.println();

		// for문을 사용하여 아스키코드 A~Z 까지 출력하시오.
		for (int i = 65; i < 91; i++) {
			System.out.print(i + " ");
//			String hex = String.format("%x", i);
//			String hex = Integer.toHexString(i);
			String hex = Integer.toString(i, 16);
			System.out.print("0x" + hex + " ");
			System.out.println((char) i);
		}
		System.out.println();

		// 정수 n을 입력받아
		// 1, 2, 4, 7, 11 과 같은 수열의
		// n 번째 항까지 출력하시오.
		Scanner sc = new Scanner(System.in);
		System.out.print("n 입력 : ");
		num = sc.nextInt();
		int result = 1;
		System.out.print(result + " ");
		for (int i = 1; i < num; i++) {
			result = result + i;
			System.out.print(result + " ");
		}
		System.out.println();
		System.out.println();

		// 8자리 정수를 입력받아 반복문을 활용하여
		// 입력받은 정수의 합을 구하여
		// 출력하는 프로그램을 작성하시오.
		System.out.print("정수 입력: ");
		String numStr = sc.next();
		String[] array = numStr.split("");
		sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += Integer.parseInt(array[i]);
		}
		String text = Arrays.toString(array);
		System.out.println(text);
		System.out.println("합은 " + sum + "입니다.");
		System.out.println();

		// 단 수와 곱해지길 원하는 수를
		// 입력하여 이와 같이 출력되게 하시오.
		int num1, num2;
		System.out.print("단수입력 : ");
		num1 = sc.nextInt();
		System.out.print("어느 수까지 출력 : ");
		num2 = sc.nextInt();
		System.out.println(num1 + "단");
		for (int i = 1; i < num2 + 1; i++) {
			result = num1 * i;
			System.out.println(num1 + "*" + i + "=" + result);
		}
		System.out.println();

		// 1보다 큰 정수(N)를 입력하여 N! 값을 구하시오.
		// 팩토리얼이란 N의 수보다 작거나 같은 모든 양의 정수의 곱
		// ex) 3! = 1 x 2 x 3 => 6
		System.out.print("입력 : ");
		num = sc.nextInt();
		sum = 1;
		for (int i = 0; i < num; i++) {
			result = (i + 1) * sum;
			sum += result;
		}
		sum -= result;
		System.out.println("출력 : " + sum);

	}

}
