package 월급계산프로그램;

public class RegularEmployee extends Employee {

	private int bonus; // 보너스

	public RegularEmployee(String empno, String name, int pay, int bonus) {
		super(); // 부모클래스 생성자
		this.empno = empno;
		this.name = name;
		this.pay = pay;
		this.bonus = bonus;
	}

	public int getMoneyPay() {
		return (pay + bonus) / 12;
	}

	public String print() {
		return empno + " : " + name + " : " + pay;
	}
}