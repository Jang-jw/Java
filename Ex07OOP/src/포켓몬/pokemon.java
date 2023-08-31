package 포켓몬;

public class pokemon {

	// 1. 필드 ( 속성, 데이터 )
	private String name; // 이름
	private String type; // 타입
	private String skill; // 스킬
	private int hp; // 체력
	private int atk; // 공격력

	// 2. 메소드 ( 행위, 기능, 로직 )
	// 모든 필드의 값을 매개변수로 받아와서
	// 객체를 생성하는 순간 데이터를 채워주는
	// 생성자 하나 만들기
	public pokemon(String name, String type, String skill, int hp, int atk) {
		this.name = name;
		this.type = type;
		this.skill = skill;
		this.hp = hp;
		this.atk = atk;
	}

	// name, hp, type, skill, atk ---> getter 메소드 생성

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTyep() {
		return type;
	}

	public void setTyep(String tyep) {
		this.type = tyep;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

}
