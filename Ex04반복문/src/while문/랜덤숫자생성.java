package while문;

import java.util.Random;

public class 랜덤숫자생성 {

	public static void main(String[] args) {

		// 랜덤한 숫자 생성하는 방법
		// 1. 랜덤한 숫자 생성하는 도구 꺼내오기
		Random ran = new Random();

		// 랜덤한 숫자 범위 지정 (1~10)
		int ranNum1 = ran.nextInt(10)+1;
		System.out.println("랜덤 숫자 : " + ranNum1);

	}

}
