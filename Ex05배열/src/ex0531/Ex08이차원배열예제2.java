package ex0531;

public class Ex08이차원배열예제2 {

	public static void main(String[] args) {

		// 2차원 배열 만들기 ( 스네이크 모양 )
		int[][] array = new int[5][5];
		int cnt = 16;
		for (int j = 0; j < array.length; j++) {
			if (j % 2 == 0) {
				cnt += array.length;
			} else {
				cnt += array.length - 1;
			}
			for (int i = 0; i < array[j].length; i++) {
				if (j % 2 == 0) {
					array[j][i] = cnt++;
				} else {
					array[j][i] = cnt--;
				}
			}
			if (j % 2 == 0) {
				continue;
			} else {
				cnt++;
			}
		}
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();

		// 풀이
		int num = 21;
		for (int i = 0; i < array.length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < array[i].length; j++) {
					array[i][j] = num++;
				}
			} else {
				// for (int j = array[i].length - 1; j >= 0; j--) => for 문에서 카운팅 할 때
				for (int j = 0; j < array[i].length; j++) { // => for 문 안에서 카운팅 할 때
					array[i][4 - j] = num++;
				}
			}
		}
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
