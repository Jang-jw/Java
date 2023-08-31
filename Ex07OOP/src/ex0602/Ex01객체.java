package ex0602;

import java.util.Scanner;

public class Ex01객체 {

	public static void main(String[] args) {

		// OOP (object oriented programming)
		// class : 설계도
		// object : 데이터
		// 하나의 클래스로 여러개의 객체 생성 가능

		// Scanner 를 만드는 방법
		Scanner sc = new Scanner(System.in);

		// 객체 생성
		// new 클래스이름();
		// 클래스 == 내가 만드는 자료형
		// 생성하고자 하는 클래스 ==> 자료형
		Person p = new Person();
		System.out.println(p);

		// String s = new String(); => String 도 Class 이다!

		Member m = new Member();
		System.out.println(m);

		// 객체 안에 데이터 채우기 (객체 안의 필드에 접근하는 방법)
		// 레퍼런스변수명.필드명
		p.name = "현진";
		p.age = 21;
		p.height = 180.5;

		// 현진의 나이를 출력해봅시다.
		System.out.println(p.age);

		// 객체가 가진 기능 (메소드) 실행
		p.walk(); // sc.nextInt(); => 동일한 방식

		Person p2 = new Person();

		p2.name = "경남";

		p2.walk();

		// ==========================================
		// JavaFesitival 참고
		// ==========================================

		System.out.println("==========================================");

		// String 이 가진 기능만 허용
		String smhrd = "스마트 인재 개발원";

		// 1. split( String );
		// 문자열을 매개변수 기준으로 나누어 주는 역할
		// [ "스마트", "인재", "개발원" ]
		String[] spl = smhrd.split(" ");
		System.out.println(spl[1]);

		// 2. substring( int );
		// 입력한 index 부터 잘라내어 문자열 형태로 반환한다.
		System.out.println(smhrd.substring(4)); // int 1개 (시작)
		System.out.println(smhrd.substring(4, 6)); // int 2개 (시작, 미만)

		// 3. contains( "문자열" ); <=> equals( "문자열" );
		System.out.println(smhrd.contains("스마트")); // 문자열 전체 비교
		System.out.println(smhrd.equals("스마트")); // 문자열 포함 여부 확인

		// 4. String => int
		String num = "123";

		// 각 기본 자료형은 대응하는 참조자료형 (클래스) 가 존재한다.
		// int <--> Integer
		Integer a = 10;
		int number = a;

		// 문자열을 정수형으로 전환
		int n = Integer.parseInt(num);

	}

}
