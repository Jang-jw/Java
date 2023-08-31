package 포켓몬;

import java.util.Scanner;

public class GameMain {

	// 1. 포켓몬 2마리 생성
	// 이름 : 피카츄, 공격력 : 15, hp : 350
	// 스킬 : 백만볼트, 타입 : 전기
	static pokemon p1 = new pokemon("피카츄", "전기", "백만볼트", 350, 15);

	// 이름 : 파이리, 공격력 : 30, hp : 400
	// 스킬 : 화염방사, 타입 : 불
	static pokemon p2 = new pokemon("파이리", "불", "화염방사", 400, 30);

	static double val;

	public static void main(String[] args) {

		// 실행하는 공간

		// 입력 도구 꺼내주기
		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println("포켓몬을 선택하세요.");
			System.out.print("[1]피카츄(HP:" + p1.getHp() + "), [2]파이리(HP:" + p2.getHp() + ") >> ");
			int choice = sc.nextInt();
			int skillAtk = 0;
			if (choice == 1) {
				val = p1.getAtk() * 1.5;
			} else if (choice == 2) {
				val = p2.getAtk() * 1.5;
			}
			skillAtk = (int) val;
			if (choice == 1) {
				// 피카츄를 선택
				// 피카츄가 파이리를 공격
				// 1) 일반공격, 스킬공격 선택
				System.out.print("[1]일반공격(공격력:" + p1.getAtk() + "), " + " [2]스킬공격(공격력:" + skillAtk + ") >> ");
				int choiceAtk = sc.nextInt();
				if (choiceAtk == 1) {
					// 일반공격, 파이리의 hp 를 피카츄의 공격력만큼 감소
					// 파이리의 현재 hp = 파이리의 원래 hp - 피카츄의 atk
					// 두마리 포켓몬의 hp 출력
					p1_NormalAtk();
				} else if (choiceAtk == 2) {
					// 스킬공격, 파이리의 hp 를 피카츄의 공격력 1.5 배 만큼 감소
					// 피카쥬의 스킬 출력
					// 두마리 포켓몬의 hp 출력
					p1_SkillAtk();
				} else {
					System.out.println("다시 선택해 주세요~");
					continue;
				}
			} else if (choice == 2) {
				// 파이리를 선택
				// 파이리가 피카츄를 공격
				// 1) 일반공격, 스킬공격 선택
				System.out.print("[1]일반공격(공격력:" + p2.getAtk() + "), " + " [2]스킬공격(공격력:" + skillAtk + ") >> ");
				int choiceAtk = sc.nextInt();
				if (choiceAtk == 1) {
					// 일반공격, 피카츄의 hp 를 파이리의 공격력만큼 감소
					// 피카츄의 현재 hp = 피카츄의 원래 hp - 파이리의 atk
					// 두마리 포켓몬의 hp 출력
					p2_NormalAtk();
				} else if (choiceAtk == 2) {
					// 스킬공격, 피카츄의 hp 를 파이리의 공격력 1.5 배 만큼 감소
					// 파이리의 스킬 출력
					// 두마리 포켓몬의 hp 출력
					p2_SkillAtk();
				} else {
					System.out.println("다시 선택해 주세요~");
					continue;
				}
			} else {
				System.out.println("잘못된 숫자를 입력하셨습니다.");
			}
			if (p1.getHp() <= 0) {
				System.out.println(p2.getName() + "가 승리하였습니다.");
				break;
			} else if (p2.getHp() <= 0) {
				System.out.println(p1.getName() + "가 승리하였습니다.");
				break;
			}
			sysoNowHp();
			System.out.println();
		}
	}

	private static void sysoNowHp() {
		System.out.println(p1.getName() + "의 현재 HP >> " + p1.getHp());
		System.out.println(p2.getName() + "의 현재 HP >> " + p2.getHp());
	}

	private static void p1_NormalAtk() {
		p2.setHp(p2.getHp() - p1.getAtk());
		System.out.println(p1.getName() + "의 " + "일반공격이 적중하였습니다!!");
	}

	private static void p1_SkillAtk() {
		val = p1.getAtk() * 1.5;
		p2.setHp(p2.getHp() - (int) val);
		System.out.println(p1.getName() + " >> " + p1.getSkill() + "~~~~~!!");
		System.out.println(p1.getName() + "의 " + p1.getSkill() + "가 " + "적중하였습니다!!");
	}

	private static void p2_NormalAtk() {
		p1.setHp(p1.getHp() - p2.getAtk());
		System.out.println(p2.getName() + "의 " + "일반공격이 적중하였습니다!!");
	}

	private static void p2_SkillAtk() {
		val = p2.getAtk() * 1.5;
		p1.setHp(p1.getHp() - (int) val);
		System.out.println(p2.getName() + " >> " + p2.getSkill() + "~~~~~!!");
		System.out.println(p1.getName() + "의 " + p2.getSkill() + "가 " + "적중하였습니다!!");
	}

}
