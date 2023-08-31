package ex0518;

public class Ex01변수 { // 중괄호는 body 라고 한다.
	// 주석
	// ctrl + (백스페이스 옆): 글자크기 조절

	// ctrl + space 자동완성
	// jvm --> main 실행
	public static void main(String[] args) {
		// ctrl + F11 : 코드 실행 단축키
		// 코드
		// Hello world 글자 출력해보기
		// syso + 자동완성 하면 출력 코드를 쉽게 생성가능
		// 문자열 (" ")
		System.out.println("Hello world");

		// int : 자료형, a : 변수명, = : 대입연산자, 3 : 값, ; : 문장마무리
		// 변수 선언 : 데이터를 저장할 상자를 만들기
		// 어떤 데이터 들어갈지, 무슨이름으로 부를지
		int a;

		// 값 대입
		a = 10;
		// int a = 3;
		System.out.println(a);

		// a 안에 값을 15로 바꾸고 싶으면??
		a = 15;
		System.out.println(a);

		// 상수 : 변하지 않는 수
		// 숫자를 담을 b 상자 만들기
		// b 에 3 담기
		final int b = 3;

		// b 값을 10 으로 바꾸기 --> 상수이기 때문에 불가
		// ctrl + d : 해당 줄 삭제하기
		// alt + 방향키(위, 아래) : 코드 이동
		// ctrl + alt + 방향키(위, 아래) : 코드 한 줄 복사
		System.out.println(b);

		// 변수명 규칙
		// 1. (필수규칙) 키워드, 중복된 변수명 사용불가
		// int int;

		// 2. 변수명은 길이제한 X, 대소문자 가림
		// A, a

		// 3. 숫자로 시작하면 안됨!
		// a10 O / 10a X

		// 4. (필수규칙) 특수문자는 $, _ 두가지만 사용가능
		// a$bc --> O
		// a#bc --> X

		// 프로그래머 사이에서 소통을 위해 사용되는 규칙

		// 1. 변수명은 소문자로 시작한다.
		// - 패키지 이름도 소문자로 시작
		// - 클래스 파일의 이름은 대문자로 시작
		// ex0518 안에 Ex01 변수라는 클래스파일이 있다.
		// ex0518.Ex01변수
		// int Ex01변수 : 클래스 이름과 중복 방지

		// 2-1. _(언더바)를 각 단어의 사이를 연결
		// apple_tree, default_file_rename_policy
		// 2-2. 각 단어의 시작 글자를 대문자로 작성
		// defaultFileRenamePolicy
	}

}
