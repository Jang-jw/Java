package javaFestival_final;

public class _003_1부터_100까지_홀수덧셈_짝수뺄셈 {

	public static void main(String[] args) {

		// 3번, 제한시간 : 8분, 획득점수 : 10점

		// 1 -2 +3 -4 ... +99 -100 를 계산하여
		// 답을 출력하시오.
		int sum = 0;
		for (int i = 1; i < 101; i++) {
			System.out.print(i % 2 == 1 ? i + " " : -i + " ");
			sum += i % 2 == 1 ? i : -i;
		}
		System.out.println();
		System.out.println("결과 : " + sum);
	}
}