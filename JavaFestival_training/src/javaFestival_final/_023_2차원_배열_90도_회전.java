package javaFestival_final;

public class _023_2차원_배열_90도_회전 {

	public static void main(String[] args) {

		// 23번, 제한시간 : 25분, 획득점수 : 40점

		// 아래와 같은 2차원 배열을 왼쪽으로 90도 회전하여
		// 출력하시오.
		int[][] array = new int[5][5];
		int cnt = 1;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				array[4 - j][i] = cnt++;
			}
		}
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
