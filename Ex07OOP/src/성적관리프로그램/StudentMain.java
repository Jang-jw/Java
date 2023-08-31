package 성적관리프로그램;

public class StudentMain {

	public static void main(String[] args) {

		// 실행 공간
		// Student 자료형을 가진 s1 이라는 객체 생성
		Student s1 = new Student("임경남", "20220458", 20, 100, 80, 35);
		// 생성자 (constructor) 메소드
		// : 클래스 이름과 같다.
		// : new 객체 생성하는 순간에 사용되는 메소드
		// : 기본생성자 ( 매개변수로 아무것도 받지 않는 생성자 매소드 )
		// : 기본생성자는 생략이 가능하다.
		Student s2 = new Student();

		System.out.println(s1.getName());
		System.out.println(s2.getName()); // 변수가 비어 있으므로 null 출력

		s1.setName("안현진"); // 변수 입력
		System.out.println(s1.getName()); // 변수 입력 후 출력

		Student s3 = new Student("김래정", "20230517", 20);
		System.out.println(s3.getName());

	}

}
