package test0616;

public class Question5 {

	public static void main(String[] args) {

		goBusan(new Train());
		goBusan(new Bus());
		goBusan(new Airplane());
	}

	private static void goBusan(Train b) {
		b.go();
	}

}
