package 상속정리;

public class Main {

	public static void main(String[] args) {

		부모클래스 a = new 부모클래스();
		a.call1();
		a.call2();
		System.out.println();
		자식클래스1 b = new 자식클래스1();
		b.call1();
		b.call2();
		System.out.println();
		자식클래스2 c = new 자식클래스2();
		c.call1(); // 재정의
		c.call2();
		System.out.println();
		부모클래스 d = new 자식클래스3(); // 업캐스팅
		d.call1();
		d.call2();
		System.out.println();
		자식클래스3 e = (자식클래스3) d; // 다운캐스팅
		e.call1();
		e.call2();
		System.out.println();
		부모클래스 f = new 자식클래스3();
		f.call1();
		f.call2();

	}

}
