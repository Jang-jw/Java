package while문;

public class ex01while문 {

	public static void main(String[] args) {

		// while문 구조
		// hello world! 5번 출력하는 코드 작성해보기

		// 반복 횟수를 카운트 해주는 num 생성하기
		int num = 0;
		while (num < 5) {
			++num;
			System.out.println("Hello World!");
		}
		System.out.println("현재 num의 값 : " + num);
		
		// 무한반목문 
		while (true) {
			++num;
			if (num > 10) {
				break;
			}
			System.out.println("Hello World22222!");
		}

	}

}
