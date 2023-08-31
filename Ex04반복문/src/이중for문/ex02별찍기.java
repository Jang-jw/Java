package 이중for문;

public class ex02별찍기 {

	public static void main(String[] args) {

		// *
		// **
		// ***
		// ****
		// *****

		for (int j = 1; j < 6; j++) {
			for (int i = 0; i < j; i++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
