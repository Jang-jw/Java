package ex0530;

public class Ex06이차원배열 {

	public static void main(String[] args) {

		// String 을 저장하는, 3행 3열의 이차원 배열을 생성
		// new 자료형[행][열]
		String[][] array = new String[3][3];

		// 이차원배열에 접근
		// 레퍼런스변수[행][열]
		array[1][1] = "현진";
		array[2][1] = "경남";

		// ===============================

		// 2차원 배열의 길이
		// 몇 행인지
		int rows = array.length; // ??
		// 몇 열인지
		int col = array[2].length; //

		// ===============================

		int[][] numbers = new int[2][3];
		int cnt = 1;
		for (int j = 0; j < numbers.length; j++) {
			for (int i = 0; i < numbers[0].length; i++) {
				numbers[j][i] = 3 * cnt;
				cnt++;

			}
		}

		// ===============================

		// 배열 안의 요소를 전부 출력
		// 단 출력할 때, 배열 모양대로 출력
		// 3 6 9
		// 12 25 18
		for (int j = 0; j < numbers.length; j++) {
			for (int i = 0; i < numbers[j].length; i++) {
				System.out.print(numbers[j][i] + "\t");
			}
			System.out.println();
		}
		System.out.println();

		// 숙제!
		// 3 12
		// 6 15
		// 9 18
		for (int j = 0; j < numbers[0].length; j++) {
			for (int i = 0; i < numbers.length; i++) {
				System.out.print(numbers[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();

		// 배열 행, 열 길이 탐색
		cnt = 0;
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(i + " 열 길이 : " + numbers[i].length);
			cnt++;
		}
		System.out.println("행 개수 합계 : " + numbers.length);

	}
}
