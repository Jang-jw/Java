import java.util.Scanner;

public class test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] point = { 92, 12, 52, 9, 11, 2, 68 };
		int[] result = new int[2];

		int min = point[0];
		int abb = 0;

		for (int i = 0; i < point.length; i++) {
			// 왜 j = 1 로 하면 안되고
			// i + 1 로 하면 되는지..
			for (int j = 0; j < point.length; j++) {
				if (i == j) {
					continue;
				}
				abb = point[i] > point[j] ? point[i] - point[j] : point[j] - point[i];
				System.out.println("min:" + min);
				System.out.println(point[i] + "-" + point[j] + "=" + abb);
				System.out.println("i:" + i + " j:" + j);
				if (abb < min) {
					min = abb;
					result[0] = i;
					result[1] = j;
					System.out.println("result[0]:" + result[0] + " result[1]:" + result[1]);
					System.out.println("result = [" + result[0] + ", " + result[1] + "]");
					System.out.println();
				}
			}
		}
		System.out.println("result = [" + result[0] + ", " + result[1] + "]");
		System.out.println();

//		int[] numbers5 = new int[5];

		// 5개의 정수를 입력 받아
		// 오름차순 정렬하여 출력하는 프로그램을 구현하시오.
//		for (int i = 0; i < 5; i++) {
//			System.out.print(i + 1 + "번째 수 입력 : ");
//			numbers5[i] = sc.nextInt();
//		}
//		for (int i = 0; i < numbers5.length; i++) {
//			for (int j = 0; j < numbers5.length; j++) {
//				if (i == j) {
//					continue;
//				} else if (numbers5[i] < numbers5[j]) {
//					int tmp = numbers5[j];
//					numbers5[j] = numbers5[i];
//					numbers5[i] = tmp;
//				}
//			}
//		}
//		System.out.println("정렬 후");
//		for (int i = 0; i < numbers5.length; i++) {
//			System.out.print(numbers5[i] + " ");
//		}

//		int[] numbers5Min = new int[numbers5.length];
//		int min = numbers5[0];
//		for (int i = 0; i < numbers5.length; i++) {
//			for (int j = i; j < numbers5.length; j++) {
//				if (min > numbers5[j]) {
//					min = numbers5[j];
//					System.out.println("min");
//				}
//			}
//			for (int j = i; j < numbers5.length; j++) {
//				if (i >= j) {
//					System.out.println("i >= j");
//					continue;
//				} else if (min > numbers5[j]) {
//					min = numbers5[j];
//					System.out.println("min " + numbers5[j]);
//				} else if (min == numbers5[j]) {
//					System.out.println("min > numbers5[j] " + numbers5[j]);
//					min = numbers5[j];
//				}
//				numbers5Min[i] = min;
//				System.out.println(i + "번째 값 " + numbers5Min[i]);
//			}
//			for (int j = 0; j < numbers5.length; j++) {
//				if (i >= j) {
//					System.out.println("i >= j");
//					continue;
//				} else if (min == numbers5[j]) {
//					System.out.println("min > numbers5[j] " + numbers5[i]);
//					min = numbers5[i];
//				}
//				numbers5Min[i] = min;
//				System.out.println(i + "번째 값 " + numbers5Min[i]);
//			}
//		}
//		for (int K = 0; K < numbers5.length; K++) {
//			if (min > numbers5[K]) {
//				min = numbers5[K];
//				System.out.println("min " + numbers5[K]);
//			}
//			numbers5Min[5] = min;
//		}
//		for (int i = 0; i < numbers5Min.length; i++) {
//			System.out.print(numbers5Min[i] + " ");
//		}
//		System.out.println();
//
//		System.out.println(numbers5[0] + " " + numbers5[1]);
//		numbers5[0] = numbers5[1];
//		numbers5[1] = numbers5[0];
//		System.out.println(numbers5[0] + " " + numbers5[1]);
	}

}