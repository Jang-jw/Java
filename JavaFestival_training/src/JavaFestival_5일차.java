import java.util.Random;
import java.util.Scanner;

public class JavaFestival_5일차 {

	public static void main(String[] args) {

		// 8칸 크기의 배열을 선언하고 랜덤수로 초기화 한 후
		// 가장 큰 수와 작은 수를 각각 출력하시오.
		int[] numbers = new int[8];

		Random ran = new Random();

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = ran.nextInt(100) + 1;
			for (int j = 0; j < i; j++) {
				if (numbers[i] == numbers[j]) {
					i--;
				}
			}
		}
		System.out.print("배열에 있는 모든 값 : ");
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
		int max = numbers[0];
		int min = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			if (max < numbers[i]) {
				max = numbers[i];
			} else if (min > numbers[i]) {
				min = numbers[i];
			}
		}
		System.out.println("가장 큰 값 : " + max);
		System.out.println("가장 작은 값 : " + min);
		System.out.println();

		// 숫자를 입력 받아 3의 배수인 숫자를
		// 출력하는 프로그램을 작성하세요.
		Scanner sc = new Scanner(System.in);

		int num = 0;
		int[] numbers10 = new int[10];
		for (int i = 0; i < 10; i++) {
			System.out.print(i + 1 + "번 째 정수 입력>>");
			num = sc.nextInt();
			if (num % 3 == 0) {
				numbers10[i] = num;
			}
		}
		System.out.print("3의 배수 : ");
		for (int i = 0; i < numbers10.length; i++) {
			if (numbers10[i] == 0) {
				continue;
			}
			System.out.print(numbers10[i] + " ");
		}
		System.out.println();
		System.out.println();

		// 중복이 없이 숫자를 뽑는 로또 프로그램을 만드시오.
		int[] numbers6 = new int[6];
		for (int i = 0; i < numbers6.length; i++) {
			numbers6[i] = ran.nextInt(45) + 1;
			for (int j = 0; j < i; j++) {
				if (numbers6[i] == numbers6[j]) {
					i--;
				}
			}
		}
		for (int i = 0; i < numbers6.length; i++) {
			System.out.println("행운의숫자 : " + numbers6[i]);
		}
		System.out.println();

		// 사용자에게 입력받아 배열의
		// 인덱스의 수 만큼 별을 출력해보세요.
		int[] numbers5 = new int[5];
		for (int i = 0; i < numbers5.length; i++) {
			System.out.print(i + "번째 별의 수 : ");
			numbers5[i] = sc.nextInt();
		}
		for (int i = 0; i < numbers5.length; i++) {
			System.out.print(numbers5[i] + ":");
			for (int j = 0; j < numbers5[i]; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
		System.out.println();

		// 아래와 같이 숫자가 담긴 1차원 배열이 주어졌을 때,
		// 두 개의 숫자를 뽑아 서로의 거리를 비교한 후
		// 거리가 가장 작은 숫자의 위치(index)를 출력하시오.
		int[] point = { 92, 32, 52, 9, 81, 2, 68 };
		int[] result = new int[2];
		min = point[0];
		for (int i = 0; i < point.length; i++) {
			for (int j = 0; j < point.length; j++) {
				if (i == j) {
					continue;
				}
				num = point[i] - point[j];
				if (num < 0) {
					num *= -1;
				} else if (min > num) {
					result[0] = i;
					result[1] = j;
					min = num;
				}
			}
		}
		System.out.println("result = [" + result[0] + ", " + result[1] + "]");

		// 스마트미디어인재개발원의 인쌤이 Java 시험문제를 채점하고 있다.
		// 문제마다 'o' 또는 'x' 로 표시가 되어 있는데 점수를 매기는 방식이 특이하다.
		// 'o' 는 점수가 누적되는 방식으로 채점되는데 이전부터 자신을 포함한 연속된
		// 'o' 의 개수 만큼의 점수로 채점이 됩니다. 예를 들어 'oooxoo' 라는 표시가
		// 있다면 순서대로 1+2+3+0+1+2=9 으로 총점이 계산됩니다. 학생이 푼 시험지에
		// 정담, 오답 여부가 표시되어 있을 때 총점을 구하는 프로그램을 작성하세요.

		System.out.println("===== 채점하기 =====");
		String[] textArray = sc.next().split("");
		num = 0;
		int sum = 0;
		for (int i = 0; i < textArray.length; i++) {
			if (textArray[i].equals("o")) {
				num++;
				sum += num;
			} else {
				num = 0;
			}
		}
		System.out.println(sum);
		System.out.println();

		// 5개의 정수를 입력 받아
		// 오름차순 정렬하여 출력하는 프로그램을 구현하시오.
		for (int i = 0; i < 5; i++) {
			System.out.print(i + 1 + "번째 수 입력 : ");
			numbers5[i] = sc.nextInt();
		}
		for (int i = 0; i < numbers5.length; i++) {
			for (int j = 0; j < numbers5.length; j++) {
				if (i == j) {
					continue;
				} else if (numbers5[i] < numbers5[j]) {
					int tmp = numbers5[j];
					numbers5[j] = numbers5[i];
					numbers5[i] = tmp;
				}
			}
		}
		System.out.println("정렬 후");
		for (int i = 0; i < numbers5.length; i++) {
			System.out.print(numbers5[i] + " ");
		}

	}

}
