package 이중for문;

public class ex06별찍기 {

	public static void main(String[] args) {

		// &&&&*
		// &&&***
		// &&*****
		// &*******
		// *********
		// &*******
		// &&*****
		// &&&***
		// &&&&*

		for (int j = 0; j < 5; j++) {
			for (int i = 0; i < 4 - j; i++) { // 4 3 2 1 0 
				System.out.print(" ");
			}
			for (int i = 0; i < 1 + j; i++) { // 1 2 3 4 5 
				System.out.print("*");
			}
			for (int i = 0; i < 0 + j; i++) { // 0 1 2 3 4 
				System.out.print("*");
			}
			for (int i = 0; i < 4 - j; i++) { // 4 3 2 1 0 
				System.out.print(" ");
			}
			System.out.println();
		}

		for (int j = 0; j < 4; j++) {
			for (int i = 0; i < 1 + j; i++) { // 1 2 3 4 
				System.out.print(" ");
			}
			for (int i = 0; i < 4 - j; i++) { // 4 3 2 1 
				System.out.print("*");
			}
			for (int i = 0; i < 3 - j; i++) { // 3 2 1 0 
				System.out.print("*");
			}
			for (int i = 0; i < 1 + j; i++) { // 1 2 3 4 
				System.out.print(" ");
			}
			System.out.println();
		}

	}

}
