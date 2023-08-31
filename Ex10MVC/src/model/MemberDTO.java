package model;

public class MemberDTO {
	// DTO : Data Transfer Object
	// : 계층간 데이터 전송을 위한 객체
	// 데이터를 편하게 주고 받기 위해 만드는 바구니 ( 자료형 )
	// entity 라고 지칭하기도 함

	// DB 의 테이블과 직접적인 연관성을 가짐
	// DTO 도 1 테이블 당 1 개씩 만들어야 한다.
	// 테이블 각각의 컬럼 데이터를 저장할 필드가 필요하다.

	// 필드
	// 필드 선언시, 테이블의 컬럼명 == 필드명
	private String id;
	private String pw;
	private int age;

	// 기본 생성자 필수
	public MemberDTO() {
		super();
	}

	public MemberDTO(String id, String pw, int age) {
		super();
		this.id = id;
		this.pw = pw;
		this.age = age;
	}

	public MemberDTO(String pw, String id) {
		super();
		this.id = id;
		this.pw = pw;
	}

	public MemberDTO(String pw) {
		super();
		this.pw = pw;
	}

	public MemberDTO(int age) {
		super();
		this.age = age;
	}

	// 메서드
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
