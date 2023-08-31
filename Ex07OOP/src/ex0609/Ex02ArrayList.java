package ex0609;

import java.util.ArrayList;

import 포켓몬.pokemon;

public class Ex02ArrayList {

	public static void main(String[] args) {

		// 제네릭을 사용하는 클래스
		Car<String, Integer> c = new Car<String, Integer>();

		// ArrayList 클래스
		// 가변 배열
		// 레퍼런스 변수들만 가질 수 있다.

		// 1. 비어있는 ArrayList 생성
		// ArrayList < 배열안에 담고싶은 자료형 >
		ArrayList<String> list = new ArrayList<String>();

		// 2. 데이터 넣기
		// .add( 데이터 );
		// 제네릭에 써준 자료형에 맞게끔 집어넣어야한다.
		list.add("안현진");
		list.add("정희운");
		list.add("김래정");
		System.out.println(list);

		// 3. 데이터 꺼내기
		// .get( index );
		String name = list.get(2);
		System.out.println(name);

		// 4. 배열의 길이
		// .size(); : 배열의 길이 반환
		int length = list.size();

		// ex) 반복문으로 ArrayList 내용물 출력하기
		for (int i = 0; i < length; i++) {
			System.out.print(list.get(i) + "\t");
		}
		System.out.println();
		System.out.println("==============================");

		// 5. 배열 안의 요소를 삭제
		// [1,2,3,4,5]
		list.remove(0);
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + "\t");
		}
		System.out.println();
		System.out.println("==============================");

		// 1. 포켓몬 데이터를 저장할 수 있는 ArrayList 선언
		ArrayList<pokemon> po = new ArrayList<pokemon>();

		// 2. 여러분들이 원하는 포켓몬 데이터를 3개 넣어주세요.
		po.add(0, new pokemon("꼬부기", "물", "급류", 1000, 50));
		po.add(1, new pokemon("버터플", "비행", "복안", 300, 10));
		po.add(2, new pokemon("메가피죤투", "비행", "노가드", 10000, 500));

		// 3. 각 포켓몬의 정보를 출력
		// "이름 : ~~~~~ / 스킬 : ~~~~~"
		for (int i = 0; i < po.size(); i++) {
			System.out.println("이름 : " + po.get(i).getName() + "\t" + "스킬 : " + po.get(i).getSkill());
			System.out.println(po.get(i));
		}

	}

}
