package javaFestival_final;

public class _009_16진수_A부터_Z까지_출력 {

	public static void main(String[] args) {

		// 9번, 제한시간 : 20분, 획득점수 : 20점

		// for 문을 사용하여 A ~ Z 까지 출력하시오.
		String[] array = { "A", "B", "C", "D", "E", "F" };
		int cnt = 0;
		for (int i = 65; i < 91; i++) {
			System.out.print(i + " " + "0x" + i / 16);
			if (i % 16 >= 10) {
				System.out.print(array[cnt] + " ");
				cnt++;
			} else {
				System.out.print(i % 16 + " ");
				cnt = 0;
			}
			System.out.println((char) i);
		}
	}

}
