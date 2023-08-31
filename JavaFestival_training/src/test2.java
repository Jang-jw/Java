
public class test2 {

	public static void main(String[] args) {

		int[] point = { 92, 12, 52, 9, 11, 2, 68 };
		int[] result = new int[2];

		int min = 100;
		int abb = 0;

		for (int i = 0; i < point.length; i++) {
			// 왜 j = 1 로 하면 안되고
			// i + 1 로 하면 되는지..
			for (int j = 0; j < point.length; j++) {
				abb = point[i] > point[j] ? point[i] - point[j] : point[j] - point[i];

				if (abb < min) {
					min = abb;
					result[0] = point[i];
					result[1] = point[j];

				}

			}

		}

		System.out.println("result = [" + result[0] + ", " + result[1] + "]");
	}

}
