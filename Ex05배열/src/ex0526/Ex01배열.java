package ex0526;

public class Ex01배열 {

	public static void main(String[] args) {

		// 1. 배열 생성
		// 같은 데이터 타입의 여러 변수를
		// 하나로 묶어서 저장하는 자료구조

		int[] numbers = new int[5];

		System.out.println(numbers);

		// 배열 원소 접근
		// 레퍼런스변수[index]
		System.out.println(numbers[2]);

		// 배열의 2번째 칸에 15라는 값을 집어넣겠다.
		numbers[1] = 15;
		System.out.println(numbers[1]);

		// index 를 초과하면 에러 발생
		// numbers[3] = 20;

		// 배열의 길이
		// 래퍼런스변수.length;
		int length = numbers.length;
		System.out.println(length);

		// 배열의 각 칸을 5의 배수로 초기화하세요.
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = 5 * (i + 1);
		}

		// 배열의 값을 전~부 출력
		// 5 10 15 20 25
		System.out.print(numbers[0] + "   ");
		System.out.print(numbers[1] + "   ");
		System.out.print(numbers[2] + "   ");
		System.out.print(numbers[3] + "   ");
		System.out.print(numbers[4] + "   ");
		System.out.println();

		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + "\t"); // \t : 열맞춤 tab 키
		}
		System.out.println();

		System.out.println("==========");

		// "[5, 10, 15, 20, 25]"
		// String text = Arrays.toString(numbers); // 사용안함
		// System.out.println(text);

		// 배열생성
		// 초기화하면서 생성!
		int[] numbers2 = { 1, 2, 3, 4, 5 };

		// 배열 공유 : clone() 사용시 배열 복사됨
		int[] numbers3 = numbers2.clone();

		numbers3[2] = 30;

		System.out.println(numbers2[2]);
		System.out.println(numbers3[2]);

	}

}
