package ex0531;

public class Ex07이차원배열예제1 {

	public static void main(String[] args) {

		// 2차원 배열 만들기
		int[][] array = new int[5][5];
		int cnt = 0;
		for (int j = 0; j < array.length; j++) {
			for (int i = 0; i < array[j].length; i++) {
				array[j][i] = ++cnt;
			}
		}
		for (int k = 0; k < array.length; k++) {
			for (int l = 0; l < array[k].length; l++) {
				System.out.print(array[k][l] + "\t");
			}
			System.out.println();
		}
	}

}
