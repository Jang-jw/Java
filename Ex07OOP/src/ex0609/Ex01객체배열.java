package ex0609;

import 포켓몬.pokemon;

public class Ex01객체배열 {

	// ctrl + shift + o : 자동 import
	public static void main(String[] args) {

		// 배열 : 같은 데이터 타입을 하나로 묶어서 저장하는 자료구조
		// ex) 정수 데이터 10개를 저장할 수 있는 배열
		int[] numbers = new int[10];

		// ex) Pokemon 데이터 10개를 저장할 수 있는 배열
		pokemon[] pokes = new pokemon[10];

		// 2번칸에 피카츄 집어넣기
		pokemon pika = new pokemon("피카츄", "전기", "백만볼트", 350, 15);
		pokes[2] = pika;

		// 익명으로 정의할 수 있음
		pokes[2] = new pokemon("피카츄", "전기", "백만볼트", 350, 15);

		System.out.println(pokes[2].getName());

	}

}
