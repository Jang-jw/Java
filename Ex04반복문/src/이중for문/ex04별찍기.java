package 이중for문;

public class ex04별찍기 {

	public static void main(String[] args) {

		//     *
		//    **
		//   ***
		//  ****
		// *****

		for (int j = 0; j < 5; j++) {
			for (int i = 0; i < 4 - j; i++) {
				System.out.print(" ");
			}
			for (int i = 0; i < j + 1; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
