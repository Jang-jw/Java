package javaFestival_final;

public class _013_012_02_보너스_가운데_글자_구하기 {

	public static void main(String[] args) {

		// 보너스 2번, 제한시간 : 10분, 획득점수 : 30점

		// getMiddle 메소드는 하나의 단어를 입력 받습니다.
		// 단어를 입력 받아서 가운데 글자를 반환하도록 getMiddle 메소드를 만들어 보세요.
		// 단어의 길이가 짝수일 경우 가운데 두글자를 반환하면 됩니다.
		// 예를들어 입력받은 단어가 power 이라면 w 를 반환하면 되고
		// 입력받은 단어가 test 라면 es 를 반환하면 됩니다.
		System.out.println(getMiddle("power"));
		System.out.println(getMiddle("rest"));
	}

	private static String getMiddle(String text) {
		String result;
		String[] array = text.split("");
		if (array.length % 2 == 0) {
			result = array[array.length / 2 - 1] + array[array.length / 2];
		} else {
			result = array[array.length / 2];
		}
		return result;
	}

}
