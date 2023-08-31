package 성적관리프로그램;

public class Student {

	// 설계도
	// 1. 필드
	private String name; // 이름
	private String number; // 학번
	private int age; // 나이
	private int scoreJava; // Java 점수
	private int scoreWeb; // Web 점수
	private int scoreAndroid; // Android 점수

	// 2. 메소드
	// 생성자 메소드 단축키
	// alt + shift + s --> grnerate constuctor using fields
	// 생성자 메소드의 특징
	// 1. 기본 생성자 메소드는 생략이 가능하다.
	// 2. 생성자도 메소드다!
	// 3. 리턴타입을 적지 않는다.
	// 4. 생성자명은 클래스명과 동일해야한다.
	// 5. 매개변수를 받는 새로운 생성자를 추가하는 순간
	// 기본생성자는 덮어씌워진다. ( 기본 생성자는 사라진다. )
	public Student(String name, String number, int age, int scoreJava, int scoreWeb, int scoreAndroid) {
		this.name = name;
		this.number = number;
		this.age = age;
		this.scoreJava = scoreJava;
		this.scoreWeb = scoreWeb;
		this.scoreAndroid = scoreAndroid;
	}

	public Student(String name, String number, int age) {
		super();
		this.name = name;
		this.number = number;
		this.age = age;
	}

	// 메소드 오버로딩 ( 중복 정의 )
	// 매개변수의 개수를 다르게 함으로써 중복으로 정의
	// getter, setter 메소드 단축키
	// alt + shift + s ---> grnerate getters and setters
	public Student() {
		// 기본 생성자
	}

	// getter 매소드
	// : 필드에 있는 데이터를 가져갈 수 있는 메소드
	public String getName() {
		return name;
	}

	// setter 메소드
	// : 필드에 있는 데이터를 수정할 수 있는 메소드
	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getScoreJava() {
		return scoreJava;
	}

	public void setScoreJava(int scoreJava) {
		this.scoreJava = scoreJava;
	}

	public int getScoreWeb() {
		return scoreWeb;
	}

	public void setScoreWeb(int scoreWeb) {
		this.scoreWeb = scoreWeb;
	}

	public int getScoreAndroid() {
		return scoreAndroid;
	}

	public void setScoreAndroid(int scoreAndroid) {
		this.scoreAndroid = scoreAndroid;
	}

	// private ( 접근제한자 ) : 외부 클래스에서 접근 불가능
	// this : 현재 클래스 자체를 의하는 키워드
	// 생성자메소드 ( constructor )
	// : 객체를 생성할 때 사용하는 메소드
	// : 기본생성자 ( 매개변수X ) 생략이 가능하다.
	// 1. 생성자도 메소드다.
	// 2. 클래스명과 메소드명이 동일하다.
	// 3. 리턴타입을 적지 않는다.
	// 4. 매개변수를 갖는 새로운 생성자를 추가하는 순간
	// 기본 생성자는 덮어씌워진다.

}
