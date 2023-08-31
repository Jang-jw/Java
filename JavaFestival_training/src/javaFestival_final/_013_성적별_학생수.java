package javaFestival_final;

public class _013_성적별_학생수 {

	public static void main(String[] args) {

		// 13번, 제한시간 : 15분, 획득점수 : 25점

		// 아래와 같이 학생들의 성적정보가
		// 문자열로 선언되어 있을 때 각 성적 별
		// 학생 수를 출력하시오.
		String[] score = { "A", "A", "B", "C", "D", "A", "C", "D", "D", "D", "F" };
		int[] result = new int[5];
		for (int i = 0; i < score.length; i++) {
			if (score[i].equals("A")) {
				result[0] += 1;
			} else if (score[i].equals("B")) {
				result[1] += 1;
			} else if (score[i].equals("C")) {
				result[2] += 1;
			} else if (score[i].equals("D")) {
				result[3] += 1;
			} else if (score[i].equals("F")) {
				result[4] += 1;
			}
		}
		for (int i = 65; i < result.length + 65; i++) {
			if (i == 69) {
				System.out.println("F : " + result[i - 65] + "명");
			} else {
				System.out.println((char) i + " : " + result[i - 65] + "명");
			}
		}
	}

}
