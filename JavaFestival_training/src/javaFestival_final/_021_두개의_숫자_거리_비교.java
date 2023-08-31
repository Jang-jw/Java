package javaFestival_final;

public class _021_두개의_숫자_거리_비교 {

	public static void main(String[] args) {

		// 21번, 제한시간 : 20분, 획득점수 : 35점

		// 아래와 같이 숫자가 담긴 1차원 배열이 주어졌을 때,
		// 두 개의 숫자를 뽑아 서로의 거리를 비교한 후
		// 거리가 가장 작은 숫자의 위치(index)를 출력하시오.
		int[] point = { 92, 32, 52, 9, 81, 2, 68 };
		int[] result = new int[2];
		int min = point[0];
		for (int i = 0; i < point.length; i++) {
			for (int j = 0; j < point.length; j++) {
				if (i == j) {
					continue;
				}
				int num = point[i] - point[j];
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

	}

}
