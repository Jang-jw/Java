package javaFestival_final;

public class _006_77_1_1_77_계산하기 {

	public static void main(String[] args) {

		// 6번, 제한시간 : 8분, 획득점수 : 15점

		// (77*1)+(76*2)+(75*3)+ ... +(1*77) 를
		// 계산하여 결과를 출력하시오.
		int sum = 0;
		for (int i = 1; i < 78; i++) {
			int result = i * (78 - i);
			sum += result;
		}
		System.out.println(sum);
	}

}
