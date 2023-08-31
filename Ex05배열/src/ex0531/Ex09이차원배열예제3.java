package ex0531;

public class Ex09이차원배열예제3 {

	public static void main(String[] args) {

		// 2차원 배열 만들기 ( 다이아몬드 모양 )
		int[][] array = new int[5][5];
		int arr = array.length;
		int cnt = 1;

		for (int j = 0; j < array.length; j++) {
			if (j == array.length / 2) {
				for (int i = 0; i < array.length; i++) {
					array[j][i] = cnt++;
				}
			} else if (j % 2 == 0) {
				for (int i = 0; i < array.length; i++) {
					if (i == arr / 2) {
						array[j][i] = cnt++;
					}
				}
			} else if (j % 2 == 1) {
				for (int i = 0; i < array.length; i++) {
					if (i == arr / 2) {
						array[j][i] = cnt++;
					} else if (i % 2 != 0) {
						array[j][i] = cnt++;
					}
				}
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
		int num = 1;
		int start = 2;
		int end = 3;

		// 만약에 행의 숫자가 2 보다 작다면 start--; end++;
		// 만약에 행의 숫자가 2 이상이라면 start++; end--;

		for (int j = 0; j < array.length; j++) {
			// 0 번째 행
			for (int i = start; i < end; i++) {
				array[j][i] = num++;
			}
			if (j < 2) {
				start--;
				end++;
			} else {
				start++;
				end--;
			}
		}
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();

	}

}
