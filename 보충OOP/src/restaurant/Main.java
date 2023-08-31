package restaurant;

public class Main {

	public static void main(String[] args) {

		// 객체 생성하는 방법
		// 데이터타입 변수명 = new 클래스명();
		Restaurant burgerRestA = new Restaurant();
		Restaurant burgerRestB = new Restaurant();

		// . (점) 으로 해당 클래스내의 필드 또는 메서드에 접근이 가능하다!
		burgerRestA.address = "광주 광역시 남구 123번지";
		burgerRestA.money = 1000000;
		burgerRestA.brand = "burgerKing";

		burgerRestB.address = "광주 광역시 남구 124번지";
		burgerRestB.money = 1000000;
		burgerRestB.brand = "맘스터치";

		// -------------------------------------------

		System.out.println(burgerRestA.money);
		burgerRestA.calculate(500000);
		System.out.println(burgerRestA.money);

	}

}
