package test0616;

public class Question4 {

	public static void main(String[] args) {

		// 모바일폰
		MobilePhone m = new MobilePhone();
		m.call();
		m.message();
		System.out.println();

		// 카메라폰
		CameraPhone c = new CameraPhone();
		c.call();
		c.message();
		c.picture();
		c.music();
		System.out.println();

		// 스마트폰
		SmartPhone s = new SmartPhone();
		s.call();
		s.message();
		s.picture();
		s.music();
		s.kakaoTalk();
		s.wifi();
	}
}
